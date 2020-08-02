package com.gbq.util;

import com.gbq.mapper.UserMapper;
import com.gbq.pojo.User;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class GbqFactoryBean implements FactoryBean {
    

    private Class aclass;

    public GbqFactoryBean(Class aclass) {
        this.aclass = aclass;
    }

    @Override
    public Object getObject() throws Exception {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{aclass}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName()+" is done");
                return null;
            }
        });
    }

    @Override
    public Class<?> getObjectType() {
        return aclass;
    }
}
