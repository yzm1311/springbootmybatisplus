package com.yy;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.yy.mapper")
public class mybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(mybatisApplication.class, args);
    }
}
/**
 * 代码都在Test中
 */