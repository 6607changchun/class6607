package com.class6607.changchun103.bin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.class6607.changchun103.controller"})
@MapperScan(basePackages = {"com.class6607.changchun103.dao"})
public class MainPrototype {
    public static void main(String[] args) {
        SpringApplication.run(MainPrototype.class,args);
    }
}
