package xu.xiaofei.autoconfigdemo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.PropertyResolver;
import xu.xiaofei.autoconfigdemo.entity.Car;
import xu.xiaofei.autoconfigdemo.entity.EnvConfig;

/**
 * @Author fei
 */

@Configuration
@ConditionalOnClass(PropertyResolver.class)
public class EnvAutoConfig {
    @Bean
    public EnvConfig envConfig() {
        return new EnvConfig();
    }

    @Bean
    public Car createCar() {
        return new Car();
    }

}

