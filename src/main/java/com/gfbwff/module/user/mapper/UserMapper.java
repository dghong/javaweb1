package com.gfbwff.module.user.mapper;


import com.gfbwff.module.user.pojo.User;

public interface UserMapper {
//    int deleteByPrimaryKey(UserKey key);
//
//    int insert(User record);
//
//    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

//    int updateByPrimaryKeySelective(User record);
//
//    int updateByPrimaryKey(User record);
}