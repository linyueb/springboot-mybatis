package com.lyue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lyue.mapper")
@SpringBootApplication
public class LyueApplication {

    public static void main(String[] args) {
        SpringApplication.run(LyueApplication.class, args);
    }

}
