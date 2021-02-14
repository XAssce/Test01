package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.example.demo.dao")
@EnableTransactionManagement
public class Test01Application {

    public static void main(String[] args) {
        SpringApplication.run(Test01Application.class, args);
    }

}
