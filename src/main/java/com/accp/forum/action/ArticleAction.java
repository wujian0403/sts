package com.accp.forum.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.forum.biz.ArticleBiz;
import com.accp.forum.biz.ReplyBiz;
import com.accp.forum.pojo.Article;
import com.accp.forum.pojo.Reply;

@RestController
@RequestMapping("/article")
public class ArticleAction {
	@Autowired
	private ArticleBiz biz;
	
	@Autowired
	private ReplyBiz biz1;
	
	@GetMapping("getArticle")
	private Map<String, Object> getArticle(Integer id) {
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("article", biz.getArticleById(id));
		map.put("size",biz1.size());
		return map;
	}
}
