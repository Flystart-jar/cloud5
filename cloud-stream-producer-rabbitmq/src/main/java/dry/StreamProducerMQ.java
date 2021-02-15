package dry;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableEurekaClient
public class StreamProducerMQ {
    public static void main(String[] args){
        SpringApplication.run(StreamProducerMQ.class,args);
    }
}
