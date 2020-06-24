package com.dxc.swd.service;


import com.dxc.swd.model.FacultyDetails;

public class FacultyServiceImpl implements FacultyService{

	@Override
	public FacultyDetails computeNoOfDays(FacultyDetails fdetails) {
		int min;
		int max;

		switch(fdetails.getLeaveType()) {
		case CASUAL: max=5;
		break;
		case SICK: max=30;
		break;
		case EARNED: max=10;
		break;
		}
		return fdetails;
		
		

	}	
}
