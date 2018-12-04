package org.ailin.iknow.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.ailin.iknow.app.model.vo.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IknowLoginController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(IknowLoginController.class); 
	
	@RequestMapping("/tologin")
	public String tologin(){
//		LOGGER.info("tologin");
		System.out.println("tologin");
		return "login/login";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request, UserVO user){
//		LOGGER.info("login");
		
		System.out.println("login");
		
		if(user == null){
			request.setAttribute("msg", "用户名或者密码错误");
			return "login/login";
		}
		if("lby".equals(user.getUsername()) && "123".equals(user.getPassword())){
			return "login/portal";
		}else{
			request.setAttribute("msg", "用户名或者密码错误");
		}
		return "login/login";
	}
}
