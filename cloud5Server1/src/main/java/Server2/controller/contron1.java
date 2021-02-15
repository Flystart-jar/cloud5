package Server2.controller;


import consumer1.pojo.user;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class contron1 {
    @Autowired
    private AmqpTemplate amqpTemplate;

    @RequestMapping(value = "/result")
    public String result(@RequestParam("name1") String name) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "完成连接" + name;

    }

    @RequestMapping(value = "/result1")
    public String result1() {
        return "完成连接001";
    }

    @RequestMapping(value = "/result2", method = RequestMethod.POST)
    public user result2(@RequestBody user user) {
        System.out.printf(user.toString());
        user user1 = new user(user.getId() + 1);
        return user1;
    }

    @RequestMapping(value = "set")
    public String set2() {
        amqpTemplate.convertAndSend("myQueue", "set1");
        return "set1";
    }


}
