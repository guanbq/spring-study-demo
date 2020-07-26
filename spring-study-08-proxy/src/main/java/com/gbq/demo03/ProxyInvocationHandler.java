package com.gbq.demo03;

import com.gbq.demo.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    private Rent rent;


    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                rent.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        Object result = method.invoke(rent, args);
        return result;
    }

    public void seeHouse() {
        System.out.println("中介带看房子");
    }
}
