
package xu.xiaofei.jms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import xu.xiaofei.jms.hello.Email;

@SpringBootApplication
@EnableJms
public class ApplicationMessagingProduce {

	public static void main(String[] args) throws InterruptedException {
		// Launch the application
		ConfigurableApplicationContext context = SpringApplication.run(ApplicationMessagingProduce.class, args);

		JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);
		// Send a message with a POJO - the template reuse the message converter
		while (true) {
			System.out.println("Sending an email message.");
			jmsTemplate.convertAndSend("http://localhost:9091/mailbox", new Email("info@example.com", "Hello"));
			Thread.sleep(1000);
		}
}

}
