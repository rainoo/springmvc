package com.gittoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class HelloMvcController {

	// localhost:8080/hello/mvc
	@RequestMapping("mvc")
	public String helloMvc() {
		return "home";
	}
}
