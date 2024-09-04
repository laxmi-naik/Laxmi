package com.xworkz.practise.external;

import com.xworkz.practise.internal.Weapon;

public class MachineGun extends Weapon{
	@Override
public void use() {
	System.out.println("running use method in MachineGun ");
}
@Override
public void  fire() {
	System.out.println("running fire method in MachineGun");
}
public void print() {
	this.use();
	this.fire();
}
}
