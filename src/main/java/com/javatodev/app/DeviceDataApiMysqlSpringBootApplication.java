package com.javatodev.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@EnableCaching
@SpringBootApplication
public class DeviceDataApiMysqlSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeviceDataApiMysqlSpringBootApplication.class, args);
    }

}
