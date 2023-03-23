package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Login;
import com.dao.LoginDao;

@Service
public class LoginService {

	@Autowired
	LoginDao loginDao;
	
	public String signIn(Login login) {
		if(loginDao.signIn(login)>0) {
			return "success";
		}else {
			return "failure";
		}
	}
	
	public String signUp(Login login) {
		if(loginDao.signUp(login)>0) {
			return "Account created";
		}else {
			return "Account didn't create";
		}
	}
}
