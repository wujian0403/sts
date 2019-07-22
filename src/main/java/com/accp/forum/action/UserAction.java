package com.accp.forum.action;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.forum.biz.UserBiz;
import com.accp.forum.pojo.User;

@RestController
@RequestMapping("/user")
public class UserAction {
	@Autowired
	private UserBiz biz;
	
	@GetMapping("login")
	public Map<String, Object> login(String account,String password,HttpSession session){
		Map<String, Object> map = biz.getMap(account, password);
		if(map.get("code").equals("200")) {
			session.setAttribute("user", map.get("msg"));
		}
		return map;
	}
	
	@GetMapping("getuser")
	public User getuser(HttpSession session){
		return (User)session.getAttribute("user");
	}
	
	@GetMapping("logout")
	public void logout(HttpSession session) {
		session.removeAttribute("user");
	}
	
	@PostMapping("signIn")
	public Map<String, String> signIn(User user){
		return biz.addUser(user);
	}
}
