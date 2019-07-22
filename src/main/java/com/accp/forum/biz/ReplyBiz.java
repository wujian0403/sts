package com.accp.forum.biz;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.forum.dao.ReplyDAO;
import com.accp.forum.pojo.Reply;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ReplyBiz {
	@Autowired
	private ReplyDAO dao;

	public PageInfo<Reply> findReply(Integer articleId, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		PageInfo<Reply> data = new PageInfo<Reply>(dao.selectAll(articleId));
		return data;
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public Map<String, String> addReply(Reply record) {
		Map<String, String> map = new HashMap<String, String>();
		if (dao.insertSelective(record) > 0) {
			map.put("code", "200");
			map.put("msg", "回复成功");
		} else {
			map.put("code", "300");
			map.put("msg", "回复失败");
		}
		return map;
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void updateReply(Reply record) {
		dao.updateByPrimaryKeySelective(record);
	}
	
	public Integer size() {
		return dao.select().size();
	}
}
