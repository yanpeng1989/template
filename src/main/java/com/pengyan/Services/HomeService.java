package com.pengyan.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pengyan.dao.UserImpl;
import com.pengyan.model.User;

@Service
public class HomeService {
	@Autowired
	public UserImpl userImpl;

	public User queryById(int id) {
		return userImpl.queryById(id);
	}

	public List<User> queryAll() {
		List<User> ls = userImpl.queryAll();
		return ls;
	}

	
}
