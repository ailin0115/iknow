package org.ailin.iknow.app.dao;

import java.util.List;

import org.ailin.iknow.app.exception.IknowBlogsException;
import org.ailin.iknow.app.model.vo.IknowBlogsVO;

public interface IknowBlogsDao {
	
	public List<IknowBlogsVO> findBlogsByPage() throws IknowBlogsException;
	
	
}
