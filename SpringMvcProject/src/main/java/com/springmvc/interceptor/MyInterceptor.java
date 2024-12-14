package com.springmvc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
	    System.out.println("This is PreHandler");

	    // Get the parameter with the correct name
	    String name = request.getParameter("UserName");

	    if (name != null && name.toLowerCase().startsWith("j")) {
	        response.setContentType("text/html");
	        response.getWriter().println("<h1>Invalid name... name should not start with j</h1>");
	        return false; // Prevent further handling of the request
	    }

	    return true; // Continue with the request handling
	}
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // You can add logic here if needed after request completion
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // Cleanup or logging after the request has been completed
        System.out.println("Request completed");
    }
}
