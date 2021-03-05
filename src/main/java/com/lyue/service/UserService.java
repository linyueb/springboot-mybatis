package com.lyue.service;

import com.lyue.entity.User;

import com.lyue.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User Sel(int id){
        return userMapper.Sel(id);
    }
    public List<User> All(String select){
        return userMapper.All(select);
    }

    public void Insert(User user){
        userMapper.insert(user);
    }
}
