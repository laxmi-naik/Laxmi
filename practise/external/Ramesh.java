package com.xworkz.practise.external;

import com.xworkz.practise.internal.Gun;
import com.xworkz.practise.internal.Weapon;

public class Ramesh extends Weapon {
	public void display() {
		Weapon weapon=new Weapon();
		use();
		weapon.fire();
		}
		
		public void show() {
		Gun gun=new Gun();
		gun.use();
		gun.fire();
		}
}
