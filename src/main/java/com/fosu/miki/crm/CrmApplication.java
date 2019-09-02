package com.fosu.miki.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.fosu.miki.crm.mapper")
public class CrmApplication {

    public static void main(String[] args) {

        SpringApplication.run(CrmApplication.class, args);
    }

}
