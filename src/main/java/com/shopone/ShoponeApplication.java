package com.shopone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.shopone.mapper")
@SpringBootApplication
public class ShoponeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoponeApplication.class, args);
    }

}
