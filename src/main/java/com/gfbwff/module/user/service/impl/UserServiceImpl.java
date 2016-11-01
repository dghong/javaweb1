package com.gfbwff.module.user.service.impl;

import com.gfbwff.module.user.mapper.UserMapper;
import com.gfbwff.module.user.pojo.User;
import com.gfbwff.module.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by gfbaiwff on 2016/10/26.
 */

@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public User selectByPrimaryKey(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public User getById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public User insert(User user) {
        return userMapper.insert(user);
    }
}
