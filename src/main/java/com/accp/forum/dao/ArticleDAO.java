package com.accp.forum.dao;

import org.apache.ibatis.annotations.Param;

import com.accp.forum.pojo.Article;

public interface ArticleDAO {

    Article selectByPrimaryKey(@Param("articleId")Integer articleId);
}