package com.highsky.springbootmybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.highsky.springbootmybatis.entity.User;
import com.highsky.springbootmybatis.mapper.UserMapper;
import com.highsky.springbootmybatis.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUserInfo(){
        return userMapper.findUserInfo();
    }


    public void insert(User user) {
        userMapper.addUserInfo(user);

    }
}
