package com.test.service.user.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.UserDao;
import com.test.model.User;
import com.test.service.user.UserService;


@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User getUserByUsername(String username) {
		User user = userDao.selectUser1(username);
		return user;
	}

	@Override
	@Transactional
	public void saveUser(String username, String password) {
		Map<String, Object> param = new HashMap<>();
		param.put("username", username);
		param.put("password", password);
		userDao.insertUser1(param);
		int a =0;
		int s = 11/a;
	}

}
