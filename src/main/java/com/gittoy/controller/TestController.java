package com.gittoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class TestController {

	@RequestMapping("login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();
		System.out.println("进入了控制器的login()方法...");
		mv.setViewName("login");
		return mv;
	}

	@RequestMapping("viewAll")
	public ModelAndView viewAll(String username, String password) {
		ModelAndView mv = new ModelAndView();
		System.out.println("进入了控制器的viewAll()方法...");
		System.out.println("username = " + username);
		System.out.println("password = " + password);
		mv.setViewName("hello");
		return mv;
	}

	@RequestMapping("query")
	public ModelAndView query(String username, String password) {
		ModelAndView mv = new ModelAndView();
		System.out.println("进入了控制器的query()方法...");
		System.out.println("username = " + username);
		System.out.println("password = " + password);
		mv.setViewName("hello");
		return mv;
	}
}
