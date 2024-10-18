package com.xworkz.driven.impl;

import com.xworkz.driven.repository.MachineRepository;

public class MachineRepImpl  implements MachineRepository{

	@Override
	public void save() {
		System.out.println("running save method in MachineRepImpl");
		
	}

	@Override
	public int update() {
		System.out.println("running update method in MachineRepImpl");
		return 0;
	}

	@Override
	public int delete() {
		System.out.println("running delete method in MachineRepImpl");
		return 0;
	}

	@Override
	public int read() {
		System.out.println("running read method in MachineRepImpl");
		return 0;
	}

}
