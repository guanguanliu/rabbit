package dubbo.rabbitmq;

import dubbo.dto.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @RabbitHandler
    @RabbitListener(queues = "rabbit")
    public void receive(User user){

        System.out.println("rabbit"+user.toString());

    }

    @RabbitHandler
    @RabbitListener(queues = "rabbitAgain")
    public void receive2(User user){

        System.out.println("rabbitAgain"+user.toString());
    }
}
