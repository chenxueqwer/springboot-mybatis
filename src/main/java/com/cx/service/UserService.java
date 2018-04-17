package com.cx.service;

import com.cx.entity.User;
import com.cx.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;
    public List<User> getAll(){
        return userMapper.getAll();
    }

    public User getOne(Long id){
        return userMapper.getOne(id);
    }

    public void insert(User user){
        userMapper.insert(user);
    }

    public void update(User user){
        userMapper.update(user);
    }

    public void delete(Long id){
        userMapper.delete(id);
    }

}
