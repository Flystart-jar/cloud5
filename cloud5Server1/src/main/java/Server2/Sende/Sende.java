package Server2.Sende;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sende {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        amqpTemplate.convertAndSend("myQueue", "发送者");
    }
}
