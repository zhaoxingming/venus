package com.alibaba.venus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * @author zhaoxingming on 17/10/20.
 * @version 1.0
 */
@SpringBootApplication
@PropertySource(value={"classpath:application.properties",
    "classpath:application-${spring.profiles.active}.properties",
    "classpath:venus-persistence-${spring.profiles.active}.properties"})
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
