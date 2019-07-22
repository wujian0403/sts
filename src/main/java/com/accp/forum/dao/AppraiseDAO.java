package com.accp.forum.dao;

import org.apache.ibatis.annotations.Param;

import com.accp.forum.pojo.Appraise;

public interface AppraiseDAO {
    int deleteByPrimaryKey(Integer appraiseId);

    int insert(Appraise record);

    int insertSelective(Appraise record);

    Appraise selectByPrimaryKey(Integer appraiseId);
    
    Appraise selectBythreadId(@Param("threadId")Integer threadId,@Param("appraise_author")Integer appraise_author);

    int updateByPrimaryKeySelective(Appraise record);

    int updateByPrimaryKey(Appraise record);
}