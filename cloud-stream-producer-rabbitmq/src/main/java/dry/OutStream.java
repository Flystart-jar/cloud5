package dry;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.messaging.support.MessageBuilder;
//import org.springframework.amqp.core.MessageBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(OutStream.SinkOutput.class)
public class OutStream {

  //  @Autowired
//    private Source source;
//    @StreamListener(SinkOutput.OUTPUT)
//    public String out() {
//        source.output().send(MessageBuilder.withPayload("sssssssssssssss").build());
//        return "ok";
//    }

    @Bean
    @InboundChannelAdapter(value = SinkOutput.OUTPUT )
    public String timerMessageSource () {
        return "okkkk";
    }

public interface SinkOutput {
    String OUTPUT = "input";

    @Output(SinkOutput.OUTPUT)
    MessageChannel output();
}
}
