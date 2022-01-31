package com.coy.poc.config;

import com.coy.poc.datasource.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@EnableConfigurationProperties(DiconstructorConfig.class)
@Configuration
public class GreetingServiceConfig {

    @Bean
    FakeDataSource fakeDataSource(DiconstructorConfig config) {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUserName(config.getUserName());
        fakeDataSource.setPassword(config.getPassword());
        fakeDataSource.setJdbcUrl(config.getJdbcUrl());

        return fakeDataSource;
    }
}
