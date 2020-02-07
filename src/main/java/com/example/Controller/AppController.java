package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.Entity.Employee;
import com.example.Service.AppService;

@Controller
public class AppController {
	
	@Autowired
	AppService service;

	public AppController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@GetMapping("/home")
	public ModelAndView homePage(){
		ModelAndView mv=new ModelAndView();
		System.out.println("welcome");
		mv.addObject("Student");
		mv.setViewName("add");
		
		return mv;
		
	}
	
	
	
	

}
