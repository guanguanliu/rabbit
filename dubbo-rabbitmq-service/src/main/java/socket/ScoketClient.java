package socket;

import com.alibaba.dubbo.common.json.JSON;
import dubbo.dto.User;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * @author
 * @ClassName
 * @Description TODO(这里用一句话描述这个类的作用)
 * @Date 2018-09-12 10:39
 */
public class ScoketClient {
    public static void main(String[] args){
        try{
            Socket socket = new Socket("localhost",7788);
            OutputStream outputStream = socket.getOutputStream();
            User user = new User();
            user.setIdCard("3748372983211");
            user.setName("杜超");
            user.setGender("女");
            user.setAge(22);
            //传输Object
            ObjectOutputStream oos = new ObjectOutputStream(outputStream);
            oos.writeObject(user);
            oos.flush();
            //传输json字符串
            String userJson = JSON.json(user);
            System.out.println(userJson);
            OutputStreamWriter osw = new OutputStreamWriter(outputStream);
            osw.write(userJson);
            osw.flush();
            socket.shutdownOutput();

        }catch(Exception exception){
            System.out.println("客户端发生错误");
        }
    }


}
