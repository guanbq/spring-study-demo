package com.gbq.demo02;

public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("新增一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除一个用户");

    }

    @Override
    public void update() {
        System.out.println("修改一个用户");
    }

    @Override
    public void find() {
        System.out.println("查找一个用户");
    }
}
