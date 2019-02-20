package com.edu.cms.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.edu.cms.model")   //扫描实体类
@ComponentScan(basePackages={"com.edu.cms.service"})                   //扫描借款
public class CMSApplication {
	public static void main(String[] args) {
		SpringApplication.run(CMSApplication.class, args);
	}
}
