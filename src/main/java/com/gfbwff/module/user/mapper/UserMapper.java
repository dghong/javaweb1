package com.gfbwff.module.user.mapper;


import com.gfbwff.module.user.pojo.User;

import java.util.List;

public interface UserMapper {
//    int deleteByPrimaryKey(UserKey key);
//
    User insert(User record);
//
//    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

    List<User> selectAll();

//    int updateByPrimaryKeySelective(User record);
//
//    int updateByPrimaryKey(User record);
}