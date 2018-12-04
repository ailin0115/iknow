package org.ailin.iknow.app.service;

import java.util.List;

import org.ailin.iknow.app.exception.IknowBlogsException;
import org.ailin.iknow.app.model.vo.IknowBlogsVO;

public interface IknowBlogsService {
	
	public List<IknowBlogsVO> findBlogsByPage() throws IknowBlogsException;
	
}
