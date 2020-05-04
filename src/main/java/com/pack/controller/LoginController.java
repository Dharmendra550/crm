package com.pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pack.dao.CustomerDao;

@Controller
public class LoginController
{
	@Autowired
	CustomerDao  dao;
	
	
	@GetMapping("/login")
	public   String  getLoginPage() {
		return  "login";
	}
	
	@PostMapping("/checkLogin")
	public  String  checkLogin(@RequestParam String email, @RequestParam String password, Model model) {
		boolean flag=dao.loginCustomer(email, password);
		if(flag==false) {
			model.addAttribute("msg", "Bad Credentials");
			return "login";
		}
		else {
			return  "loginSuccess";
		}
	}
}


