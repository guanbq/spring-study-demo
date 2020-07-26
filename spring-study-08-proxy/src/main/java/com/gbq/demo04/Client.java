package com.gbq.demo04;

import com.gbq.demo02.UserService;
import com.gbq.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        CommonProxy cp = new CommonProxy();
        cp.setTarget(userService);
        UserService us = (UserService) cp.getProxy();
        us.add();

    }
}
