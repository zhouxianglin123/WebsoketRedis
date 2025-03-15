package com.mybatisdemo.springbootmybatisplus.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mybatisdemo.springbootmybatisplus.mapper.UserMapper;
import com.mybatisdemo.springbootmybatisplus.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User login(String account, String password) {
        // 构造查询条件
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("account", account)
                .eq("password", password);

        // 查询用户
        User user = userMapper.selectOne(queryWrapper);

        // 返回查询结果
        return user;
    }
}
