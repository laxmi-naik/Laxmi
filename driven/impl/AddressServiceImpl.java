package com.xworkz.driven.impl;

import com.xworkz.driven.repository.AddressRepository;
import com.xworkz.driven.service.AddressService;

public class AddressServiceImpl  implements AddressService{
	private AddressRepository addressRepository;
	public void setAddressRepository(AddressRepository addressRepository) {
		this.addressRepository=addressRepository;
	}

	@Override
	public String push() {
		System.out.println("running push method in AddressServiceImpl");
		if(addressRepository!=null)
		{
			System.out.println("repo is not null");
			boolean store=addressRepository.save();
			
			
			if(store)
			{
				System.out.println("store in repo");
				return "success";
				
			}
			else
			{
				System.out.println("repo is not stored");
				return "failure";
			}
		}
		return null;
	}

	@Override
	public String refresh() {
		System.out.println("running refresh method in AddressServiceImpl");
		if(addressRepository!=null)
		{
			System.out.println("repo is not null");
			int ref=addressRepository.update();
			
			
			if(ref>10)
			{
				System.out.println("ref in repo");
				return "success";
				
			}
			else
			{
				System.out.println("repo is not stored");
				return "failure";
			}
		}
		return null;
	}

	@Override
	public String remove() {
		System.out.println("running remove method in AddressServiceImpl");
		if(addressRepository!=null)
		{
			System.out.println("repo is not null");
			addressRepository.delete();
			
		}
			
			else
			{
				System.out.println("repo is not stored");
				return "failure";
			}
		
		return null;
	}

	@Override
	public String load() {
		System.out.println("running load method in AddressServiceImpl");
		if(addressRepository!=null)
		{
			System.out.println("repo is not null");
			String  check=addressRepository.read();
			
			
			if(check!=null)
			{
				System.out.println("store in repo");
				return "success";
				
			}
			else
			{
				System.out.println("repo is not stored");
				return "failure";
			}
		}
		return null;
	}

}
