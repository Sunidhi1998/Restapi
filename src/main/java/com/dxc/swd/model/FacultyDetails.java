package com.dxc.swd.model;

public class FacultyDetails {
	
	private int empId;
	private String firstName;
	private String lastName;
	private LeaveType LeaveType;
	private int noOfDays;
	
	public FacultyDetails() {
		//left unimplemented
	}


	public LeaveType getLeaveType() {
		return LeaveType;
	}


	public void setLeaveType(LeaveType leaveType) {
		LeaveType = leaveType;
	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	

}
