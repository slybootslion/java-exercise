package com.sketchmac.community.dao;

import com.sketchmac.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    // 根据id查找用户
    User selectById(int id);

    // 根据用户名查找用户
    User selectByName(String username);

    // 根据邮箱查找用户
    User selectByEmail(String email);

    // 插入数据
    int insertUser(User user);

    // 更新用户状态
    int updateStatus(int id, int status);

    // 更新用户头像
    int updateHeader(int id, String headerUrl);

    // 更新密码
    int updatePassword(int id, String password);
}
