package com.coy.sect4.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean,
        BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("## I'm in the LifeCycleDemoBean constructor");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## setBeanName");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## afterPropertiesSet");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## setBeanFactory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## setApplicationContext");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## preDestroy");
    }
}
