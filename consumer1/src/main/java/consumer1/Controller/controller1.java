package consumer1.Controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import consumer1.impl.FeignImpl;
import consumer1.pojo.user;
import consumer1.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class controller1 {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    FeignImpl feign;

    @Autowired
    Service service;

    @RequestMapping(value = "/get")
    public String GetValue(@RequestParam(required = false, value = "name") String name) {
//        String string=restTemplate.getForObject("http://localhost:8802/result?name="+name,String.class);
//        return string+"consumer";
        return feign.get(name);
    }

    @RequestMapping(value = "/get2")
    public String GetValue2() {
        consumer1.pojo.user user = new user("999");
        //(路径，传参对象，要服务返回类型)
        user user1 = restTemplate.postForObject("http://localhost:8802/result2", user, consumer1.pojo.user.class);

        return user1.toString();
    }

    @RequestMapping(value = "/get3")
    public String GetValue3() {
        consumer1.pojo.user user = new user("888");
        //(路径，传参对象，要服务返回类型)
        user user1 = feign.get3(user);
        return user1.toString();
    }

    @RequestMapping(value = "/getResult")
    public String GetValue4(@RequestParam("name") String name1) {
        return "qqq";
    }

    @RequestMapping("/a")
    public String a(){
        return service.bb();
    }
}
