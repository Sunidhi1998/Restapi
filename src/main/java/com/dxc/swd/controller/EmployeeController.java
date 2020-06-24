package com.dxc.swd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dxc.swd.model.Employee;
import com.dxc.swd.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@RequestMapping(value="/emp",method=RequestMethod.GET)
	public String showEmpForm() {
		return "empInputPage";
	}
	
	@RequestMapping(value="/emp",method=RequestMethod.POST)
	public ModelAndView acceptEmp(@ModelAttribute Employee emp) {
		empService.computeAllowence(emp);
		return new ModelAndView("empOutputPage", "emp", emp);
	}
}
