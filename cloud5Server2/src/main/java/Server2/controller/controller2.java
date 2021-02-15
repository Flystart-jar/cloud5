package Server2.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller2 {
    @Autowired
    private AmqpTemplate amqpTemplate;

    @RequestMapping(value = "/result")
    public String result(@RequestParam("name1") String name) {
        return "server2" + name;
    }

    @RequestMapping(value = "/result1")
    public String result1() {
        return "server2";
    }

    @RequestMapping(value = "set2")
    public String set2(){
        amqpTemplate.convertAndSend("myQueue","set222");
        return "ok Set2";
    }
}
