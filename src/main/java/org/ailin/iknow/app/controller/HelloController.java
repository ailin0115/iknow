package org.ailin.iknow.app.controller;

import org.ailin.iknow.app.exception.IknowBlogsException;
import org.ailin.iknow.app.service.IknowBlogsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
	
	@Autowired
	private IknowBlogsService iknowBlogsService;
	
	@RequestMapping("/hello")
	public String hello() throws IknowBlogsException{
		return "hello";
	}
	
	@RequestMapping("/sayHello")
	public String sayHello(String name) throws IknowBlogsException{
		return "hello " +name+ "!";
	}
}
