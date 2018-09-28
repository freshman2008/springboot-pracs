package com.highsky.springbootmybatis.service;

import com.highsky.springbootmybatis.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getUserInfo();
    public void insert(User user);
}
