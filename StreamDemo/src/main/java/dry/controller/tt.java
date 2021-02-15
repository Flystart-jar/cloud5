package dry.controller;

        import org.springframework.cloud.stream.annotation.EnableBinding;
        import org.springframework.cloud.stream.annotation.StreamListener;
        import org.springframework.cloud.stream.messaging.Sink;
        import org.springframework.stereotype.Service;

@Service
@EnableBinding(Sink.class)//立即连接消息代理
public class tt {

    @StreamListener(Sink.INPUT)//已流进行处理
    public void handle(String person) {
        System.out.println("Received222: " + person);
    }
}
