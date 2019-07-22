package com.accp.forum.biz;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.forum.dao.UserDAO;
import com.accp.forum.pojo.User;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class UserBiz {
	@Autowired
	private UserDAO dao;
	
	public Map<String, Object> getMap(String account,String password){
		Map<String, Object> map = new HashMap<String,Object>();
		if(dao.selectUser(account,null)!=null) {
			User user = dao.selectUser(account, password);
			if(user!=null) {
				map.put("code", "200");
				map.put("msg", user);
			}else {
				map.put("code", "300");
				map.put("msg", "登录失败，密码错误");
			}
		}else {
			map.put("code", "300");
			map.put("msg", "登录失败，没有找到姓名为"+account+"的用户");
		}
		return map;
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public Map<String, String> addUser(User user){
		Map<String, String> map = new HashMap<String,String>();
			if(dao.insertSelective(user)>0) {
				map.put("code", "200");
				map.put("msg", "注册成功");
			}else {
				map.put("code", "300");
				map.put("msg", "注册失败");
			}
		return map;
	}
}
