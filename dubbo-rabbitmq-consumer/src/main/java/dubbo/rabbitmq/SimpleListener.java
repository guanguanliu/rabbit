package dubbo.rabbitmq;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.stereotype.Component;

/**
 * @author 关
 * @ClassName SimpleListener
 * @Description TODO(这里用一句话描述这个类的作用)
 * @Date 2018-09-17 16:12
 */
@Component("simpleListener")
public class SimpleListener implements ChannelAwareMessageListener {
    @Override
    public void onMessage(Message message, Channel channel) throws Exception {

        byte[] body = message.getBody();
        String string = new String(body,"utf-8");
        System.out.println(string);
        channel.basicNack(message.getMessageProperties().getDeliveryTag(),false,true);
    }
}
