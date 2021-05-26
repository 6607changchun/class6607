package com.class6607.changchun103.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "train")
@Configuration
@Getter@Setter
public class TrainConfig {
    private String name;
    private String type;
    private Integer maxSpeed;
}
