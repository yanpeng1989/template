package com.pengyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pengyan.Services.HomeService;

@Controller
public class HomeController {
	@Autowired
	HomeService homeService;

	@RequestMapping(value = "index")
	public String Test() {
		System.out.println("++++++++++++"+homeService.queryById(1).getAddress().toString()+"++++++++++++");
		return "index";
	}

}
