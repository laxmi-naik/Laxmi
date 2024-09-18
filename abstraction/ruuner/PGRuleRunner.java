package com.xworksz.abstraction.ruuner;

import com.xworksz.abstraction.PGRule;
import com.xworksz.abstraction.media.GirlsPG;
import com.xworksz.abstraction.media.PGRuleImpl;

public class PGRuleRunner {

	public static void main(String[] args) {
		PGRule pg=new PGRuleImpl();
		GirlsPG girlsPG=new GirlsPG();
		girlsPG.setPGRule(pg);
		girlsPG.time();
	}

}
