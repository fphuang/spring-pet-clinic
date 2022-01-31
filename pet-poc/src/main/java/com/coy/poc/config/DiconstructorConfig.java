package com.coy.poc.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties("guru")
@Getter
public class DiconstructorConfig {
    private final String userName;
    private final String password;
    private final String jdbcUrl;

    public DiconstructorConfig(String userName, String password, String jdbcUrl) {
        this.userName = userName;
        this.password = password;
        this.jdbcUrl = jdbcUrl;
    }
}
