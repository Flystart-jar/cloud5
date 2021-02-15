package dry.Controller;

import dry.Receiver.MyReceiver;
import dry.Sender.Sende;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitAction {

    @Autowired
    private Sende sende;
    @Autowired
   private AmqpTemplate amqpTemplate;


    @RequestMapping("/get")
    public void Get(String message) {
         sende.send();
    }

    @RequestMapping("/get2")
    public void Get2(String message) {
        amqpTemplate.convertAndSend("myQueue","ttttttttttttttttt");
    }
}
