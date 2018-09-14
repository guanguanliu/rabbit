package socket.concurrency;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author
 * @ClassName
 * @Description TODO(这里用一句话描述这个类的作用)
 * @Date 2018-09-13 9:50
 */
public class SocketsClient {

    public static Socket socket = null;
    public static OutputStream os = null;
    public static InputStream is = null;

    static{
        try {
            socket = new Socket("localhost",6566);
            os = socket.getOutputStream();
            is = socket.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {

        while(true){
            try {
                os.write("情不知所起".getBytes(
                ));
               // socket.shutdownOutput();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
