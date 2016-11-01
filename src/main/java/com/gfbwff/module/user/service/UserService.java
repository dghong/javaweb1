package com.gfbwff.module.user.service;

import com.gfbwff.module.user.pojo.User;

import java.util.List;

/**
 * Created by gfbaiwff on 2016/10/26.
 */
public interface UserService {
    User selectByPrimaryKey(Long id);
    List<User> selectAll();
    User getById(Long id);
    User insert(User user);
}
