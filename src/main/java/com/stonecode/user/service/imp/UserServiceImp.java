package com.stonecode.user.service.imp;

import com.stonecode.util.Constants;
import com.stonecode.util.StoneEncode;
import com.stonecode.util.StoneUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Map;

import com.stonecode.interfaces.UserInteface;
import com.stonecode.user.service.UserService;

@Service("UserServiceImp")
public class UserServiceImp implements UserService{
	private final Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	UserInteface userInteface;
	
	@Override
	public Map<String,Object> login(String username,String password) {
		try{
			Map<String,Object> map=userInteface.login(username, password);
			
		}catch(Exception e){
			logger.error(e.getMessage(), e);
		}
		return StoneUtil.formatResult(Constants.HTTP_ERROR, null);
	}
	
	
	

}
 