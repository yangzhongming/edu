package com.edu.cms.manage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.cms.model.request.QueryPageRequest;
import com.edu.cms.service.CmsPageService;

@RestController
@RequestMapping("cms/page")
public class CmsPageController implements CmsPageService{

	@Override
	public void findList(int page, int size, QueryPageRequest queryPageRequst) {
		// TODO Auto-generated method stub
		
	}

}
