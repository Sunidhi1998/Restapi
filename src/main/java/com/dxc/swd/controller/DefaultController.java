package com.dxc.swd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {

	@RequestMapping({"","/","/home"})
	public String showHomePage() {
		return "home";
	}
	
	@RequestMapping("/contact")
	public ModelAndView showContactUsPage() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("contactPage");
		mv.addObject("mailId","webAdmin@dxc.com");
		mv.addObject("mobiles",new String[] {"90522224753","9948016004","9550204753"});
		
		return mv;
	}
	@RequestMapping("/nav")
	public String getNav() {
		return "navPage";
		
	}
}
