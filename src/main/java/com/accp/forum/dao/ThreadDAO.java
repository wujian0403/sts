package com.accp.forum.dao;

import com.accp.forum.pojo.Thread;

public interface ThreadDAO {
    int deleteByPrimaryKey(Integer threadId);

    int insert(Thread record);

    int insertSelective(Thread record);

    Thread selectByPrimaryKey(Integer threadId);

    int updateByPrimaryKeySelective(Thread record);

    int updateByPrimaryKey(Thread record);
}