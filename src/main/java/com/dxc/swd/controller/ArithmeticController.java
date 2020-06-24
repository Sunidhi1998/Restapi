package com.dxc.swd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ArithmeticController {

	@RequestMapping("/arth")
	public ModelAndView arthOperations(@RequestParam(name = "op1", required = false, defaultValue = "0") int operand1,
			@RequestParam(name = "op2", required = false, defaultValue = "0") int operand2,
			@RequestParam(name = "operation", required = false) String operation) {

		ModelAndView mv = new ModelAndView();

		mv.setViewName("arithemeticPage");

		String result = null;

		if (operation != null) {
			switch (operation) {
			case "sum":
				result = "Sum is " + (operand1 + operand2);
				break;
			case "dif":
				result = "Dif is " + (operand1 - operand2);
				break;
			case "prd":
				result = "Prd is " + (operand1 * operand2);
				break;
			case "qut":
				result = "Qut is " + (operand1 / operand2);
				break;
			case "rem":
				result = "Rem is " + (operand1 % operand2);
				break;
			}
		}
		
		mv.addObject("result",result);
		
		return mv;
	}
}
