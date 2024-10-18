package com.xworkz.driven.impl;

import com.xworkz.driven.repository.AddressRepository;

public class AddressRepImpl implements AddressRepository {

	@Override
	public boolean save() {
		System.out.println("running save method in AddressRepImpl ");
		return true;
	}

	@Override
	public int update() {
		System.out.println("running update method in AddressRepImpl ");
		return 1;
	}

	@Override
	public void delete() {
		System.out.println("running delete method in AddressRepImpl ");
		
	}

	@Override
	public String read() {
		System.out.println("running String method in AddressRepImpl ");
		return null;
	}

}
