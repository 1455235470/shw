package com.shu.shw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shu.shw.mapper")
public class ShwApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShwApplication.class, args);
    }
}
