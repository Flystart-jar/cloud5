import dry.Sender.Sende;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
public class ABC {

    @Autowired
    private Sende sende;

    @Test
    public void Hello(){
        sende.send();
    }
}