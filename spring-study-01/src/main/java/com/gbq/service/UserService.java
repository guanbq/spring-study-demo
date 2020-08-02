package com.gbq.service;

import com.gbq.mapper.OrderMapper;
import com.gbq.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private OrderMapper orderMapper;

    public void show(){
        userMapper.select();
        System.out.println(orderMapper);
    }
}
