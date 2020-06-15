package net.springmvc.service;

import org.springframework.stereotype.Service;
@Service
public class InfoService implements IInfoService {
	@Override
	public String getMsg() {
		return "Hello ";
	}
} 
