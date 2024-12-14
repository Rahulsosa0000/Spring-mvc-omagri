package com.springmvc.interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

	@GetMapping("/user")
	public String user() {
		
		return "user";
	}
	
	@PostMapping("/welcomeuser")
	public String welcome(@RequestParam("UserName") String name,Model model) {
		
		model.addAttribute("name",name);
		System.out.println(name);
		
		return "welcomeuser";
		
	}
}
