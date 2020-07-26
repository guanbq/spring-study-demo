package com.gbq.demo03;

import com.gbq.demo.Host;
import com.gbq.demo.Rent;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        Host host = new Host();
        // 代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(host);

        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();


    }

}
