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
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.web.servlet.ModelAndView;

import com.examples.spring.web.mvc.model.User;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = {"/register"})
@SessionAttributes("username")
public class RegistrationController {
	
	private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView showRegisterForm() {
		ModelAndView modelView = new ModelAndView("register");
		return modelView;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView register(@RequestHeader("Host") String host,@RequestParam("username") String username, @RequestParam("password") String password, HttpServletRequest request,HttpSession session) {
//		Enumeration<String> headerNames=request.getHeaderNames();
//		while(headerNames.hasMoreElements()) {
//			String headerName=headerNames.nextElement();
//			logger.info("{}:{}",headerName,request.getHeader(headerName));
//		}
		logger.info("Host:{}",host);
		User obj=new User();
		obj.setUsername("username");
		obj.setPassword("password");
		ModelAndView modelView = new ModelAndView("regSuccess");
		//session.setAttribute("username",username);
		session.setAttribute("password",password);
		System.out.println(session.getId());
		modelView.addObject("username",username);
		return modelView;
	}	
}
