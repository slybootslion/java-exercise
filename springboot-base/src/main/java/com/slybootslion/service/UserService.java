package com.slybootslion.service;

import com.slybootslion.mapper.UserMapper;
import com.slybootslion.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    // 查询
    public User getById(Long id) {

        return userMapper.selectByPrimaryKey(id);
    }

    // 新增
    @Transactional
    public void saveUser(User user) {
        userMapper.insertSelective(user);
        System.out.println("用户保存成功");
    }

}
