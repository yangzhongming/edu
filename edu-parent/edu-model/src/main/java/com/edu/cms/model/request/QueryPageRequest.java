package com.edu.cms.model.request;

import lombok.Data;

/**
 * 接收页面查询条件
 *
 */
@Data
public class QueryPageRequest 
{   
	//站点ID
	private String siteId;
	//页面ID
	private String pageId;
	//页面名称
	private String pageName;
	//页面别名
	private String pageAlise;
	//模板ID
	private String templateId;
	
}
