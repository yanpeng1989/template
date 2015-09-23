package com.pengyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pengyan.Services.HomeService;

@Controller
public class HomeController {
	@Autowired
	HomeService homeService;

	@RequestMapping(value = "index")
	public String Test(Model model) {
		model.addAttribute("name", homeService.queryAll().get(0).getName());
		model.addAttribute("age", homeService.queryAll().get(0).getAge());
		return "index";
	}

	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String Delete(@RequestParam("id") int id) {
		homeService.delete(id);
		return "index";
	}

	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public String Insert(@RequestParam("name") String name, @RequestParam("age") String age, @RequestParam("address") String address, @RequestParam("comment") String comment) {

		return "index";
	}

	@RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
	public ModelAndView welcome() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Welcome - Spring Security Hello World");
		model.addObject("message", "This is welcome page!");
		model.setViewName("hello");
		return model;
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView admin() {

		ModelAndView model = new ModelAndView();

		model.addObject("title", "Admin - Spring Security Hello World");
		model.addObject("message", "This is protected page!");
		model.setViewName("admin");

		return model;
	}

	@RequestMapping(value = "/map", method = RequestMethod.GET)
	public String map() {
		return "map";
	}

}
