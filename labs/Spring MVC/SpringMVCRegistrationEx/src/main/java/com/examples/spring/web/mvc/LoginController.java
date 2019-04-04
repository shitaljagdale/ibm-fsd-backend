package com.examples.spring.web.mvc;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = {"/login"})
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView showRegisterForm() {
		ModelAndView modelView = new ModelAndView("login");
		return modelView;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView register(@RequestHeader("Host") String host,@RequestParam("username") String username, @RequestParam("password") String password, HttpServletRequest request,HttpSession session) {
		ModelAndView modelView = new ModelAndView("login.jsp");
		session.setAttribute("username",username);
		session.setAttribute("password",password);
		
		modelView.addObject("username",username);
		
		return modelView;
	}	
}
