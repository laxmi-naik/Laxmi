package com.xworksz.abstraction.media;

import com.xworksz.abstraction.PGRule;

public class GirlsPG {
private PGRule pgRule;
public void setPGRule(PGRule pgRule) {
	this.pgRule=pgRule;
}
public void time() {
	if(pgRule!=null) {
		System.out.println("running time method in girlspg");
		pgRule.costPerMonth();
		pgRule.wifi();
	}
	else {
		System.out.println("pgRule is null");
	}
}
}
