package com.stonecode.interfaces;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("TimesServiceBottomUser")
public interface UserInteface {
	
	@RequestMapping(value = "/user/login/{username}/{password}")
	public Map<String,Object> login(@PathVariable(value="username") String username,@PathVariable(value="password") String password);

}
