package com.gbq.demo;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        Host host = new Host();
        // 代理角色
        HostProxy hostProxy = new HostProxy();
        hostProxy.setHost(host);
        hostProxy.rent();
    }
}
