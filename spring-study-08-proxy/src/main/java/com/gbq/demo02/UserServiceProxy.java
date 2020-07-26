package com.gbq.demo02;

public class UserServiceProxy implements UserService {

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    private UserServiceImpl userService;


    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void find() {
        log("find");
        userService.find();
    }

    public void log(String msg) {
        System.out.println("[log] 执行了" + msg + "方法");
    }
}
