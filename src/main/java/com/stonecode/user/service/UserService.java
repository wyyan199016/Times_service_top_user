package com.stonecode.user.service;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public interface UserService {
	
	@RequestMapping(value = "/login/{username}/{password}")
	public Map<String,Object> login(@PathVariable String username,@PathVariable String password);

}
