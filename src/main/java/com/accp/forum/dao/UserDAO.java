package com.accp.forum.dao;

import org.apache.ibatis.annotations.Param;

import com.accp.forum.pojo.User;

public interface UserDAO {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);
    
    User selectUser(@Param("account")String account,@Param("password")String password);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}