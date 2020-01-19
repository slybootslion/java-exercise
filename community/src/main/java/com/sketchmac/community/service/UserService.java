package com.sketchmac.community.service;

import com.sketchmac.community.dao.UserMapper;
import com.sketchmac.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据id查找用户
     */
    public User findUserById(int id) {
        return userMapper.selectById(id);
    }
}
