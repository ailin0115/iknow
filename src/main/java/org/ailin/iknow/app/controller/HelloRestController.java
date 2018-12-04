package org.ailin.iknow.app.controller;

import org.ailin.iknow.app.exception.IknowBlogsException;
import org.ailin.iknow.app.model.vo.UserVO;
import org.ailin.iknow.app.service.IknowBlogsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restHello")
public class HelloRestController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
	
	@Autowired
	private IknowBlogsService iknowBlogsService;
	
	@RequestMapping("/hello")
	public String restHello() throws IknowBlogsException{
		return "hello";
	}
	
	@RequestMapping("/sayHello")
	public String restSayHello(String name) throws IknowBlogsException{
		return "hello " +name+ "!";
	}
	
	@RequestMapping("/getUser")
	public UserVO getUser() throws IknowBlogsException{
		UserVO vo = new UserVO();
		vo.setUsername("lby");
		vo.setPassword("123");
		return vo;
	}
}
