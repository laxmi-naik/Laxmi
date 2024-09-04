package com.xworks.data.typeinheritance.runner;

import com.xworks.data.typeinheritance.Cd;


public class ComputerRunner {

	public static void main(String[] args) {
		Cd  cd=new Cd("hp",40000);
		cd.show();
		cd.boot();
		cd.take();

	}

}
