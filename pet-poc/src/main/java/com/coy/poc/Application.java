package com.coy.poc;

import com.coy.poc.config.DiconstructorConfig;
import com.coy.poc.datasource.FakeDataSource;
import com.coy.poc.services.PrototypeBean;
import com.coy.poc.services.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        final ApplicationContext ctx = SpringApplication.run(Application.class, args);
        demo3(ctx);
    }

    private static void demo1(ApplicationContext ctx) {
        System.out.println("Bean scope");
        SingletonBean sb1 = ctx.getBean(SingletonBean.class);
        System.out.println(sb1.getMyScope());
        SingletonBean sb2 = ctx.getBean(SingletonBean.class);
        System.out.println(sb2.getMyScope());

        PrototypeBean pt1 = ctx.getBean(PrototypeBean.class);
        System.out.println(pt1.getMyScope());
        PrototypeBean pt2 = ctx.getBean(PrototypeBean.class);
        System.out.println(pt2.getMyScope());
    }

    private static void demo2(ApplicationContext ctx) {
        System.out.println("----- fake data source");
        FakeDataSource fakeDataSource = ctx.getBean((FakeDataSource.class));
        System.out.println(fakeDataSource.getUserName());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getJdbcUrl());
    }

    private static void demo3(ApplicationContext ctx) {
        System.out.println("----- constructor Binding");
        DiconstructorConfig config = ctx.getBean(DiconstructorConfig.class);
        System.out.println(config.getUserName());
        System.out.println(config.getPassword());
        System.out.println(config.getJdbcUrl());
    }
}
