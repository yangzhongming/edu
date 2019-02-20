package com.edu.cms.service;

import com.edu.cms.model.request.QueryPageRequest;

/**
 * Hello world!
 * 
 */
public interface CmsPageService 
{
	//页面查询
	public void findList(int page,int size,QueryPageRequest queryPageRequst);
}
