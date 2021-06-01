package com.class6607.changchun103.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataBaseConfig {

    @Bean(name = "database1")
    @ConfigurationProperties(prefix = "spring.datasource.database1")
    public DataSource dataSource1(){
        return DataSourceBuilder.create().build();
    }


}
