package socket;

import com.alibaba.dubbo.common.json.JSON;
import com.alibaba.dubbo.common.json.ParseException;
import dubbo.dto.User;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author
 * @ClassName
 * @Description TODO(这里用一句话描述这个类的作用)
 * @Date 2018-09-12 10:21
 */
public class SocketServer {
    public static void main(String[] args){
        try {
            ServerSocket serverSocket = new ServerSocket(7788);
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            //传输Object
//            ObjectInputStream ois = new ObjectInputStream(inputStream);
//            User user = (User) ois.readObject();
            //传输json字符串
            InputStreamReader isr = new InputStreamReader(inputStream);
            BufferedReader br = new BufferedReader(isr);
            String string = null;
            if((string = br.readLine()) != null){

                User user = JSON.parse(string,User.class);
                System.out.println(user.toString());
            }

            socket.shutdownInput();
        }catch(IOException e){
            System.out.println("服务器socket错误");
        }catch (ParseException e){
            System.out.println("转换失败");
        }

    }
}
