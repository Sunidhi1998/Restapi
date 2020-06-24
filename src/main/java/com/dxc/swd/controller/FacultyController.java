package com.dxc.swd.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dxc.swd.model.FacultyDetails;
import com.dxc.swd.model.LeaveType;
import com.dxc.swd.service.FacultyService;


@Controller
//request mapping use to provide url
@RequestMapping("/faculty")
public class FacultyController {
	
	@Autowired
	private FacultyService fService;

	
	//@RequestMapping(value=" ",method=RequestMethod.GET)
	//@GetMapping("")
	@GetMapping
	public ModelAndView facultyform() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("facultyInputPage");
		
		 mv.addObject("fac",new FacultyDetails());
		 
		 mv.addObject("LeaveTypes",LeaveType.values());
		 return mv;
	}
	
	@PostMapping
	public ModelAndView acceptfaculty(@ModelAttribute FacultyDetails fac) {
		

		
		
		 return new ModelAndView("farmerOutputPage","fac",fac);
	}
}