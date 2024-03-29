package com.example.dubbo_demo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableDubbo
@SpringBootApplication
public class DubboDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboDemoApplication.class, args);
    }

}
