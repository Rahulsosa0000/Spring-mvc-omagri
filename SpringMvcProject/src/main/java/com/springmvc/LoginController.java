package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

	// login view
	@GetMapping("/login")
	public String showLoginView() {

		return "login";
	}

	@PostMapping("/login")
	public String login(@RequestParam("username") String Username, 
			@RequestParam("password") String Password,
			HttpServletRequest request)
	  {
		if ("admin".equals(Username) && "password".equals(Password)) {
			request.getSession().setAttribute("user", Username);
			return "welcome";
		}
		return "login";
	  }

	/*
	 * request.getSession()
	 * 
	 * It accesses the session where user-specific information is stored on the
	 * server. .setAttribute("user", username)
	 * 
	 * It saves your username (username) in the session.
	 */
}
