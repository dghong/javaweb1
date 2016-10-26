package com.gfbwff.module.user.service;

import com.gfbwff.module.user.pojo.User;

/**
 * Created by gfbaiwff on 2016/10/26.
 */
public interface UserService {
    User selectByPrimaryKey(Long id);
}
