package com.gbq.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class User implements BeanNameAware, ApplicationContextAware {

    @Value("gbq")
    private String name;

    public String getBeanName() {
        return beanName;
    }

    private String beanName;

    private ApplicationContext applicationContext;

    // BeanNameAware 获取bean name，在bean初始化时获取
    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", beanName='" + beanName + '\'' +
                ", applicationContext=" + applicationContext +
                '}';
    }

    // ApplicationContextAware 获取创建bean 的工厂，在bean初始化时获取
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
