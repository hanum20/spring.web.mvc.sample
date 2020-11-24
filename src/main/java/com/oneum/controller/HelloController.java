package com.oneum.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.oneum.service.BoardService;

@Controller
public class HelloController {
	
	@Autowired
	BoardService service;
	
	@RequestMapping("/")
	public String index(){		
		return "index";
	}
	
	@RequestMapping("/signup")
	public String signUpForm(){
		System.out.println("helll");
		return "signupForm";
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public String signUpProcess(@RequestParam Map<String, Object> member){
		System.out.println(member.toString());
		try {
			service.signUp(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/signin";
	}
	
	@RequestMapping("/signin")
	public String signInForm(){
		return "signinForm";
	}
	
	@RequestMapping(value="/signin", method=RequestMethod.POST)
	public String signInProcess(@RequestParam Map<String, Object> member){
		System.out.println(member.toString());
		try {
			service.signIn(member);
		} catch (Exception e) {
			return "LoginFail";
		}
		return "redirect:/";
	}
}
