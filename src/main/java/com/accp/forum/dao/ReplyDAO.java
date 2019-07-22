package com.accp.forum.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.forum.pojo.Reply;

public interface ReplyDAO {
    int insert(Reply record);

    int insertSelective(Reply record);
    
    List<Reply> selectAll(@Param("id") Integer id);
    
    int updateByPrimaryKeySelective(Reply record);
    
    List<Reply> select();
    
    
}