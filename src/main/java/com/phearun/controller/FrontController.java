package com.phearun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/* *
 * Understanding about annotation @Controller & @RequestMapping
 * */
@Controller
public class FrontController {

	@RequestMapping("/home")
	public String home(){
		System.out.println("Hello World1!");
		return "/WEB-INF/index.jsp"; //use this style if you don't work with viewResolver
	}
	
	@RequestMapping("/home1")
	public String home1(){
		System.out.println("Hello World2!");
		return "index";
	}
	
	@RequestMapping(value = {"/", "/home2"}) 
	public String home2(){
		System.out.println("Hello World3!");
		return "index";
	}
	
	@RequestMapping(value = {"/admin", "/admin/dashboard"}) 
	public String dashboard(){
		System.out.println("Admin dashboard!");
		return "/admin/dashboard";
	}
	
}
