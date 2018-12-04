package org.ailin.iknow.app.model.vo;

/**
 * 知识库主表
 * @author lby
 * 20180709
 */
public class IknowBlogsVO extends BaseModel{
	
	private Integer ikId;
	private String ikTitle;// 标题
	private String ikContent;// 内容
	private String ikCategory;// 类别
	private String ikLabel;// 标签
	
	public Integer getIkId() {
		return ikId;
	}
	public void setIkId(Integer ikId) {
		this.ikId = ikId;
	}
	public String getIkTitle() {
		return ikTitle;
	}
	public void setIkTitle(String ikTitle) {
		this.ikTitle = ikTitle;
	}
	public String getIkContent() {
		return ikContent;
	}
	public void setIkContent(String ikContent) {
		this.ikContent = ikContent;
	}
	public String getIkCategory() {
		return ikCategory;
	}
	public void setIkCategory(String ikCategory) {
		this.ikCategory = ikCategory;
	}
	public String getIkLabel() {
		return ikLabel;
	}
	public void setIkLabel(String ikLabel) {
		this.ikLabel = ikLabel;
	}
	
}
