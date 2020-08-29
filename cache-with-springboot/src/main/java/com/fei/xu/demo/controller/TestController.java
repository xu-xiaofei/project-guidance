package com.fei.xu.demo.controller;

import com.fei.xu.demo.service.HelloWorldService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Observer;

/**
 * @Author fei
 */
@Slf4j
@Controller
@RequestMapping("/test/cache")
@ResponseBody
public class TestController {

    @Resource
    private HelloWorldService service;

    @GetMapping("1")
    public Object testCacheSum() throws Exception {
        int resultSum = service.calculateSum(10);
        return resultSum;
    }

    @GetMapping("2")
    public Object testCacheDesc() throws Exception {
        int resultSum = service.calculateDesc(10);
        return resultSum;
    }

    @GetMapping("3")
    public Object testCacheMulti() throws Exception {
        int resultSum = service.calculateMulti(10);
        return resultSum;
    }
}
