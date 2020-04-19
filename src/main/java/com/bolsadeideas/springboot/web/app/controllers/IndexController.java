package com.bolsadeideas.springboot.web.app.controllers;


import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.User;


@Controller 
@RequestMapping("/app")
public class IndexController {
	
	@GetMapping({"/index","/","/home"})
	public String index(Map<String,String> map) {
		map.put("title", "Hello Srping Map puro");
		map.put("date", "La hora es: " +  LocalDateTime.now().toString());
		return "index";
	}
	
	@GetMapping("/profile")
	public String profile(Model model) {
		User myUser = new User();
		myUser.setName("Juli");
		myUser.setSurname("Cruz");
		myUser.setEmail("j.cruz@digitalmind.com");
		
		model.addAttribute("title", myUser.getName()+ " profile");
		model.addAttribute("user", myUser);
		return "profile";
	}
	
}
