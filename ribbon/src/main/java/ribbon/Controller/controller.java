package ribbon.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class controller {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "getService")
    public String getS(){
        return restTemplate.getForEntity("http://service1/result",String.class).getBody();
    }
}
