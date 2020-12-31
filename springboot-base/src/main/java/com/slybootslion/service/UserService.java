package com.slybootslion.service;

import com.slybootslion.pojo.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    // 查询
    public User getById(Long id) {
        return new User();
    }

    // 新增
    @Transactional
    public void saveUser(User user) {
        System.out.println("用户保存成功");
    }

}
