package com.fei.xu.demo.service;

import com.fei.xu.demo.config.CacheConf;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author fei
 */
@Service
@Slf4j
public class HelloWorldService {


    @Cacheable(value = "testSum",keyGenerator = CacheConf.MY_KEY)
    public int calculateSum(int startNumber) throws Exception{
//        Thread.sleep(5000);
        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(1);

        for (int i = 2; i < startNumber; i++) {
            result.add(result.get(i - 1) + result.get(i - 1));
        }
        int resultNumber = result.get(result.size() - 1);
        return resultNumber;
    }

    @Cacheable(value = "test", keyGenerator = CacheConf.MY_KEY)
    public int calculateDesc(int initNumber) throws Exception {

        Thread.sleep(5000);
        return -1;
    }

    @Cacheable(value = "test", keyGenerator = CacheConf.MY_KEY)
    public int calculateMulti(int initNumber) throws Exception {

        Thread.sleep(5000);
        return 1;
    }

}
