package com.annotation;

//UserController.java

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.User;

@Controller
public class RequestParamAnnotation {
	
	
	@RequestMapping("/contect")
	public String contect() {
		return "contect";
	}

//	@RequestMapping(path = "/register",method = RequestMethod.POST)
//	public String regForm(
//			@RequestParam(name="email", required=true) String email,
//			@RequestParam("name") String name,
//			@RequestParam("password") String password, Model model) {
//		
//		System.out.println("Email: "+email);
//		System.out.println("Name: "+name);
//		System.out.println("Password: "+password);
//		
//		model.addAttribute("name",name);  // dynamically add data 
//		model.addAttribute("email",email);
//		model.addAttribute("password",password);
//		
//		/* old way by using httpservlet
//		 * String email= request.getParameter("email");
//		 * System.out.println("Email: "+email); String name=
//		 * request.getParameter("name"); System.out.println("Name: "+name); String
//		 * password= request.getParameter("password");
//		 * System.out.println("Password: "+password);
//		 */
//		
//		
//		return "successreg";
//
//	}
//	
	
	
	// second way to get parameter from views using @MODELATTRIBUTE ANNOTATION 
	
	@RequestMapping(path = "/register",method = RequestMethod.POST)
	public String regForm(@ModelAttribute User user, Model model) {
		System.out.println("Using ModelAttributes Annoataion");
		// Automatically Bind data from the User
		return "successreg";

	}
	

}
