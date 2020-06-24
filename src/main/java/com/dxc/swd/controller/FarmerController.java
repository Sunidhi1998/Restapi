package com.dxc.swd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dxc.swd.model.CropType;
import com.dxc.swd.model.Farmer;
import com.dxc.swd.service.FarmerService;


@Controller
//request mapping use to provide url
@RequestMapping("/farmer")
public class FarmerController {
	
	@Autowired
	private FarmerService fService;

	
	//@RequestMapping(value=" ",method=RequestMethod.GET)
	//@GetMapping("")
	@GetMapping
	public ModelAndView farmerform() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("farmerInputPage");
		
		 mv.addObject("frm",new Farmer());
		 
		 mv.addObject("cropTypes",CropType.values());
		 return mv;
	}
	
	@PostMapping
	public ModelAndView acceptfarmer(@ModelAttribute Farmer fom) {
		
		fService.computeEligibleLoan1(fom);
		
		
		
		
		 return new ModelAndView("farmerOutputPage","frm",fom);
	}
}