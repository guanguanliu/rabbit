package dubbo;

import dubbo.dto.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SendMsg {

    @Resource
    private AmqpTemplate amqpTemplate;

   // private Channel channel;

    @RequestMapping("/send")
    public void sendMsg(){

        User user = new User();
        user.setAge(25);
        user.setGender("男");
        user.setName("罐罐");

        user.setIdCard("140495121580682719");

        //ValidatorUtils.validate(user);
        //channel.basicPublish("fanout",rabbitQueue,false,);
        //String msg = "兰兰";
        amqpTemplate.convertAndSend("queue",user);
    }

    @RequestMapping("/sendAgain")
    public void sendAgain(){

        User user = new User();
        user.setAge(25);
        user.setGender("女");
        user.setName("关关");
        amqpTemplate.convertAndSend("rabbitAgain",user);
    }
}
