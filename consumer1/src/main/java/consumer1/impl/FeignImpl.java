package consumer1.impl;

import consumer1.pojo.user;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//要访问的在Eureka注册的客户端的Application名
@FeignClient("service1")
public interface FeignImpl {
    @RequestMapping("/result2")
    public user get3(@RequestBody user user);

    @RequestMapping("/result")
    public String get(@RequestParam("name1") String name);

    @RequestMapping("/result1")
    public String get1();
}
