
package xu.xiaofei.jms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import xu.xiaofei.jms.hello.Email;

@SpringBootApplication
@EnableJms
public class Application {

	public static void main(String[] args) {
		// Launch the application
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);
		// Send a message with a POJO - the template reuse the message converter
		System.out.println("Sending an email message.");
		jmsTemplate.convertAndSend("mailbox", new Email("info@example.com", "Hello"));
	}

}
