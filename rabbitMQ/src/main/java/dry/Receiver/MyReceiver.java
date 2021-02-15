package dry.Receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "myQueue")
public class MyReceiver {

    @RabbitHandler
    public void Get(String message) {
        System.out.println(message + "接收者");
    }
}
