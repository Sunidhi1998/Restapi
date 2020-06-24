package com.dxc.swd.model;

public class Farmer {
	
	private double fieldArea;
	private double MaxAmount;
	private double eligibleLoan;
	private CropType cropType;
	private double oldLoan;
	
	public Farmer() {
		//unimplemented
	}

	public double getFieldArea() {
		return fieldArea;
	}

	public void setFieldArea(double fieldArea) {
		this.fieldArea = fieldArea;
	}

	public double getMaxAmount() {
		return MaxAmount;
	}

	public void setMaxAmount(double maxAmount) {
		MaxAmount = maxAmount;
	}

	public double getEligibleLoan() {
		return eligibleLoan;
	}

	public void setEligibleLoan(double eligibleLoan) {
		this.eligibleLoan = eligibleLoan;
	}



	public CropType getCropType() {
		return cropType;
	}

	public void setCropType(CropType cropType) {
		this.cropType = cropType;
	}

	public double getOldLoan() {
		return oldLoan;
	}

	public void setOldLoan(double oldLoan) {
		this.oldLoan = oldLoan;
	}
	
	
}