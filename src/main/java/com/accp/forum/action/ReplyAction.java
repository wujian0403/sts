package com.accp.forum.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.forum.biz.AppraiseBiz;
import com.accp.forum.biz.ReplyBiz;
import com.accp.forum.pojo.Appraise;
import com.accp.forum.pojo.Reply;
import com.accp.forum.pojo.User;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/reply")
public class ReplyAction {
	@Autowired
	private ReplyBiz biz;
	
	@Autowired
	private AppraiseBiz biz1;
	
	@GetMapping("/find")
	public PageInfo<Reply> find(Integer article_id,Integer pageNum,Integer pageSize){
		return biz.findReply(article_id, pageNum, pageSize);
	}
	
	@PostMapping("/insert")
	public Map<String, String> insert(Reply reply){
		return biz.addReply(reply);
	}
	
	@PutMapping("/update")
	public Map<String, String> update(Integer like,Integer trample,Integer replyId,HttpSession session) {
		User user = (User)session.getAttribute("user");
		if(like==0) {
			like = null;
		}
		if(trample==0) {
			trample=null;
		}
		Reply reply = new Reply();
		reply.setLike(like);
		reply.setTrample(trample);
		reply.setReplyId(replyId);
		Map<String, String> map = new HashMap<String,String>();
		if(biz1.getAppraise(replyId, user.getUserId())!=null) {
			map.put("code", "300");
			map.put("msg", "您已经进行过顶或踩了");
		}else {
			biz.updateReply(reply);
			map.put("code", "200");
		}
		return map;
	}
}
