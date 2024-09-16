package com.xworks.interfaces.media;

import com.xworks.interfaces.Docter;

public class Hospital implements Docter {
	
public Hospital() {
	super();
	System.out.println("running no agr const in hospital");
}
	@Override
	public boolean silence() {
		System.out.println("running silence method in hospital");
		return true;
	}

	@Override
	public int visitor() {
		System.out.println("running visitor method in hospital");
		return 3;
	}

	@Override
	public boolean noSmoking() {
		System.out.println("running no smoking method  in hospital");
		return true;
	}


}
