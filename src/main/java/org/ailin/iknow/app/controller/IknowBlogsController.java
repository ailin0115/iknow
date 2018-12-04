package org.ailin.iknow.app.controller;

import java.util.List;

import org.ailin.iknow.app.common.consts.LabelConsts;
import org.ailin.iknow.app.exception.IknowBlogsException;
import org.ailin.iknow.app.model.ResultVO;
import org.ailin.iknow.app.model.vo.IknowBlogsVO;
import org.ailin.iknow.app.service.IknowBlogsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blogs")
public class IknowBlogsController extends BaseController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(IknowBlogsController.class);
	
	@Autowired
	private IknowBlogsService iknowBlogsService;
	
	@RequestMapping("/findBlogsByPage")
	public ResultVO<IknowBlogsVO> findBlogsByPage() throws IknowBlogsException{
		
		List<IknowBlogsVO> blogsList = iknowBlogsService.findBlogsByPage();
		
		return success(LabelConsts.SUCCESS_MESSAGE, blogsList);
	}
	
}
