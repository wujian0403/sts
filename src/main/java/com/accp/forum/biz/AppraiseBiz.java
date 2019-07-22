package com.accp.forum.biz;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.forum.dao.AppraiseDAO;
import com.accp.forum.pojo.Appraise;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class AppraiseBiz {
	
	@Autowired
	private AppraiseDAO dao;
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void addAppraise(Integer appraiseAuthor,Integer threadId) {
		Appraise app = new Appraise();
		app.setAppraiseAuthor(appraiseAuthor);
		app.setThreadId(threadId);
		dao.insertSelective(app);
	}
	
	public Appraise getAppraise(Integer threadId,Integer appraise_author) {
		return dao.selectBythreadId(threadId, appraise_author);
	}

}
