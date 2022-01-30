package com.coy.sect4;

import com.coy.sect4.controllers.*;
import com.coy.sect4.services.LifeCycleDemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        demo1(ctx);
        demo2(ctx);
    }

    private static void demo1(ApplicationContext ctx ) {

        System.out.println("------- I18N");
        I18NController i18NController = (I18NController) ctx.getBean(("i18nController"));
        System.out.println(i18NController.sayHello());

        System.out.println("------- primary");
        MyController controller = (MyController) ctx.getBean("myController");
        System.out.println(controller.sayHello());

        System.out.println("------- property");
        var propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("------- setter");
        var setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("------- constructor");
        var constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }

    private static void demo2(ApplicationContext ctx ) {

        System.out.println("------- demo2");
        LifeCycleDemoBean demoBean = (LifeCycleDemoBean) ctx.getBean(("lifeCycleDemoBean"));
    }
}
