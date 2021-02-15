package dry.producer;

import dry.OutStream;
//import dry.impl.HelloBinding;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableBinding(HelloBinding.class)
public class ProducerController {

    @Autowired
    private OutStream outStream;
//    private MessageChannel greet;
//
//    public ProducerController(HelloBinding helloBinding){
//        this.greet=helloBinding.greeting();
//    }
//
//    @RequestMapping("/greeet")
//    public void publish(@RequestParam("name") String name){
//        byte[] s=name.getBytes();
//        Message<String> msg= (Message<String>) MessageBuilder.withClonedBody(s).build();
//        this.greet.send(msg);
//    }

    @RequestMapping("/out")
    public String out(){
     return   outStream.timerMessageSource();
    }
}
