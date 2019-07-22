package com.accp.forum.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.forum.dao.ArticleDAO;
import com.accp.forum.pojo.Article;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ArticleBiz {
	@Autowired
	private ArticleDAO dao;
	
	public Article getArticleById(Integer article_id) {
		return dao.selectByPrimaryKey(article_id);
	}
}
