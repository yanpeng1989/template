package com.pengyan.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pengyan.dao.HomeDao;

@Service
public class HomeService {
	@Autowired
	public HomeDao homeDao;
}
