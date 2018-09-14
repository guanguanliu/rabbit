package socket.concurrency;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author guan
 * @ClassName
 * @Description TODO(这里用一句话描述这个类的作用)
 * @Date 2018-09-13 9:26
 */
public class SocketsService implements Runnable{

    private ServerSocket serverSocket;

    public SocketsService(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    @Override
    public void run() {
        Socket socket = null;
        try {
            socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            while(true){

                byte[] buff = new byte[1024];
                int len = 0;
                len = inputStream.read(buff);
                System.out.println(new java.lang.String(buff,0,len));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(6566);
            SocketsService socketsService = new SocketsService(serverSocket);
            Thread thread = new Thread(socketsService);
            thread.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
