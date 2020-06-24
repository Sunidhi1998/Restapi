package com.dxc.swd.service;

import org.springframework.stereotype.Service;

import com.dxc.swd.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void computeAllowence(Employee emp) {
		double basic = emp.getBasic();
		emp.setHra(basic*0.10);
		emp.setTa(basic*0.15);
	}

}
