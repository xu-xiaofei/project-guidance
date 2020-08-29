package com.fei.xu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @Author fei
 */
@SpringBootApplication
@EnableCaching
public class CacheApplication {
    public static void main(String[] args) {
        SpringApplication.run(CacheApplication.class,args);
    }
}

/*
* 核心类有两个 org.springframework.cache.Cache 和 org.springframework.cache.CacheManager
*
* Cache 定义了缓存的存取操作的
*
* CacheManager 定义了缓存的管理最大容量和过期设置
*
*
* */