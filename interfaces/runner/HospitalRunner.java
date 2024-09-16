package com.xworks.interfaces.runner;

import com.xworks.interfaces.media.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {
		Hospital hospital = new Hospital() ;
		hospital.silence();
		hospital.visitor();
		hospital.noSmoking();
		
	}

}
