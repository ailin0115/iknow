package org.ailin.iknow.app.service.impl;

import java.util.List;

import org.ailin.iknow.app.dao.IknowBlogsDao;
import org.ailin.iknow.app.exception.IknowBlogsException;
import org.ailin.iknow.app.model.vo.IknowBlogsVO;
import org.ailin.iknow.app.service.IknowBlogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IknowBlogsServiceImpl implements IknowBlogsService{
	
	@Autowired
	private IknowBlogsDao iknowBlogsDao;
	
	@Override
	public List<IknowBlogsVO> findBlogsByPage() throws IknowBlogsException{
		return iknowBlogsDao.findBlogsByPage();
	}

}
