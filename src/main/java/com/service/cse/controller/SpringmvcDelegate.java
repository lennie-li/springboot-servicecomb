package com.service.cse.controller;

import com.service.cse.domain.User;
import com.service.cse.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class SpringmvcDelegate {
    @Autowired
    private UserMapper userMapper;

    public User helloworld(int id){

        // Do Some Magic Here!
        return userMapper.selectUser(id);
    }
}
