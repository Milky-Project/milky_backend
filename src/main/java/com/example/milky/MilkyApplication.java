package com.example.milky;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example"})
@MapperScan(value = {"com.example.repository"})
public class MilkyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MilkyApplication.class, args);
    }

}
