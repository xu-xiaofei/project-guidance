package xu.xiaofei.autoconfigdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xu.xiaofei.autoconfigdemo.entity.Car;
import xu.xiaofei.autoconfigdemo.entity.EnvConfig;

import javax.annotation.Resource;

/**
 * @Author fei
 */
@RestController
@Slf4j
public class TestAwareController {

    @Resource
    EnvConfig envConfig;

    @Resource
    Car car;

    @GetMapping("/autoconfigure/auto/aware")
    public String testAutoAware(){
        envConfig.getLongValue("");
        car.printName();
        return "";
    }

    //似乎并不需要继承Aware接口，就可以实现注入
    //还有待研究
}
