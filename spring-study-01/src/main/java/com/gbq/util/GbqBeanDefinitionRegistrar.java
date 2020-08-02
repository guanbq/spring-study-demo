package com.gbq.util;

import com.gbq.mapper.OrderMapper;
import com.gbq.mapper.UserMapper;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.List;

public class GbqBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar{
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {

        List<Class> list = new ArrayList<>();
        list.add(UserMapper.class);
        list.add(OrderMapper.class);

        for (Class aClass : list) {
            BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition();
            AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();

            beanDefinition.setBeanClass(GbqFactoryBean.class);
            beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(aClass);

            registry.registerBeanDefinition(aClass.getName(),beanDefinition);
        }


    }
}
