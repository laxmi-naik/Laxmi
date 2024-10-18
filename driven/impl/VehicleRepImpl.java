package com.xworkz.driven.impl;

import com.xworkz.driven.repository.VehicleRepository;

public class VehicleRepImpl implements VehicleRepository {

	@Override
	public void save() {
		System.out.println("running save method in VehicleRepImpl");
		
	}

	@Override
	public void update() {
		System.out.println("running update method in VehicleRepImpl");
		
	}

	@Override
	public boolean delete() {
		System.out.println("running delete method in VehicleRepImpl");
		return false;
	}

	@Override
	public String read() {
		System.out.println("running read method in VehicleRepImpl");
		return null;
	}

}
