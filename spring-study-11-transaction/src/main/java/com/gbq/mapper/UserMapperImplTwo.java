package com.gbq.mapper;

import com.gbq.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImplTwo extends SqlSessionDaoSupport implements UserMapper{

    // private UserMapper userMapper = getSqlSession().getMapper(UserMapper.class);

    @Override
    public List<User> selectUser() {
        User user = new User("sd",3,45);

        addUser(user);
        deleteUser(3);

        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
