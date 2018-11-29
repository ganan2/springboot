package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;

@RestController
public class HomeController {

	@RequestMapping(value = "/home", method = { RequestMethod.GET, RequestMethod.POST })
	public String  getCustomers(@ModelAttribute User user, Model model) {
		return "/index";
	}
	
	@RequestMapping(value = "/user", method = { RequestMethod.GET, RequestMethod.POST })
	public String  getUserResponse(@ModelAttribute User user, Model model) {
		return "/user";
	}
}
