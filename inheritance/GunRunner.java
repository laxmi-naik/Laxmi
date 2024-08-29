package com.xworks.inheritance;

import com.xworks.inheritance.things.Dboss;
import com.xworks.inheritance.things.Godse;
import com.xworks.inheritance.things.Gun;
import com.xworks.inheritance.things.Police;
import com.xworks.inheritance.things.Soldier;

public class GunRunner {

	public static void main(String[] args) {
		Soldier soldier=new Soldier();
		soldier.shoot();
		
		
		Police police =new Police();
		Gun  gun =new Gun("rifles", "india", "pistol");
		police.mar(gun);
		
		
		Gun gun1=new Gun("rifles", "india", "pistol");
		Dboss dboss =new Dboss(gun1);
		dboss.blast();
		
     		
		Godse godse=new Godse();
		godse.gunfire();
	}

}
