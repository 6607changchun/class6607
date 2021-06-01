package com.class6607.changchun103.bin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.class6607.changchun103.controller","com.class6607.changchun103.util","com.class6607.changchun103.config"})
@ConfigurationPropertiesScan("com.class6607.changchun103.config")
public class MainPrototype {
    public static void main(String[] args) {
        SpringApplication.run(MainPrototype.class,args);
    }
}
