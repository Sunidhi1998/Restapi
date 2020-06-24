package com.dxc.swd.service;

import org.springframework.stereotype.Service;

import com.dxc.swd.model.Farmer;


@Service
public class FarmerServiceImpl implements FarmerService {

	
	@Override
	public Farmer computeEligibleLoan1(Farmer fom) {
		
	
		double maxAmountPeracre=0;
		switch(fom.getCropType()) {
		case CERALS: maxAmountPeracre=100000;
		break;
		case PULSES: maxAmountPeracre=200000;
		break;
		case AQUA: maxAmountPeracre=200000;
		break;
		case COMMERCIALS: maxAmountPeracre=400000;
		break;
		}
		
		fom.setMaxAmount(maxAmountPeracre*fom.getFieldArea());
		fom.setEligibleLoan(fom.getMaxAmount()-fom.getOldLoan());
		return fom;
	}

		
	}


