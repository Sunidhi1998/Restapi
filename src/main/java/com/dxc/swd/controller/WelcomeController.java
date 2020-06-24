package com.dxc.swd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public ModelAndView welcomeUser(@RequestParam(name = "unm", required = false) String userName) {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("welcomePage");

		if (userName != null) {
			mv.addObject("msg", "Hello " + userName + "! Welcome onboard!");
		}
		return mv;
	}
}
