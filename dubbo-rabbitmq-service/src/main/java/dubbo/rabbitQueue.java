package dubbo;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class rabbitQueue {

    @Bean
    public Queue newQueue(){

        return new Queue("rabbit");
    }

    @Bean
    public Queue queueAgain(){

        return new Queue("rabbitAgain");
    }
}
