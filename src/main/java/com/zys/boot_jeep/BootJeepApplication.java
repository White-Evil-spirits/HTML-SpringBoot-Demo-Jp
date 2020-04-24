package com.zys.boot_jeep;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.zys.boot_jeep.mapper"})
public class BootJeepApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootJeepApplication.class, args);
    }

}
