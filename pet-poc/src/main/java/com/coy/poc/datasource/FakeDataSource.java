package com.coy.poc.datasource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeDataSource {
    private String userName;
    private String password;
    private String jdbcUrl;
}
