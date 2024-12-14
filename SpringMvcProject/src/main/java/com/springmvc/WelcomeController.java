package com.springmvc;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	
    @GetMapping("/welcome")
    public String welcome() {
        
        return "welcome";
    }
    // model class
    @GetMapping("/home")
	public String home(Model model) { // sending data from controller to view(HTML) 
    	
    	model.addAttribute("Name","Jigo");
    	model.addAttribute("Age", 25);
    	
    	List<String> name=  new ArrayList<String>();
    	name.add("Dipak");
    	name.add("Tarun");
    	name.add("Kapil");
    	name.add("Ramu");
    	name.add("Piyush");
    	
    	model.addAttribute("n",name);
    	
		System.out.println("This is Home Page");
		return "home";
	}

    // modelAndview class
    
    @GetMapping("/help")
    public ModelAndView help() {  // manages view(html,jsp) and data 
    	System.out.println("This is help controller");
    	ModelAndView modelandview= new ModelAndView();
    	modelandview.addObject("StudentName","Vishal");
    	modelandview.addObject("StudentName2","Ramesh");
    	modelandview.setViewName("help");
		return modelandview;
	
	}
    
    
    
    
    
    
    
    
}
