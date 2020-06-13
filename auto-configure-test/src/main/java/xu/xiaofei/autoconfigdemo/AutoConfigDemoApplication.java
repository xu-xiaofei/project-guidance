package xu.xiaofei.autoconfigdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutoConfigDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoConfigDemoApplication.class, args);
        //引入web才会hold住，否则直接执行完毕退出
    }

}
