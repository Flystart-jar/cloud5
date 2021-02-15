package consumer1.service;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "myQueue")
public class Receiver {

    @RabbitHandler
    public void get(String message){
        System.out.println(message);
    }
}
