package xu.xiaofei.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @Author fei
 */
@Component
public class Receiver {

    @JmsListener(destination = "http://localhost:9091/mailbox")
    public void receiveMessage(Email email) {
        System.out.println("Received <" + email + ">");
    }

}

