package com.gbq.util;

import com.gbq.pojo.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class GbqBeanFactoryPosrtProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition("user");
        configurableListableBeanFactory.getBean("user");
        System.out.println("123");

        // 通过工厂注册自己new 的对象
        configurableListableBeanFactory.registerSingleton("local",new User());



    }
}
