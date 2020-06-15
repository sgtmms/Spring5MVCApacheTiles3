package net.springmvc.service;

import org.springframework.security.access.annotation.Secured;
public interface IInfoService {
	@Secured("authenticated")
	public String getMsg();
} 
