package com.pengyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pengyan.Services.HomeService;

@Controller
public class HomeController {
	@Autowired
	HomeService homeService;

	@RequestMapping(value = "index")
	public String Test(Model model) {
		model.addAttribute("ls", homeService.queryAll().size());
		System.out.println(homeService.queryAll().get(0).getId());
		System.out.println(homeService.queryAll().get(0).getComment());
		System.out.println(homeService.queryAll().get(0).getAge());
		System.out.println(homeService.queryAll().get(0).getName());
		return "index";
	}

}
