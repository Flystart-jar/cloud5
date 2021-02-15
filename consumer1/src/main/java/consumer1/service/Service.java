package consumer1.service;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import consumer1.impl.FeignImpl;
import consumer1.impl.FeignImpl2;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    FeignImpl2 feignImpl2;

    @Autowired
    FeignImpl feign;

    @HystrixCommand(fallbackMethod = "back")
    public String bb()
    {
        return feign.get1();
    }

    public String back(){
        return "往外";
    }
}
