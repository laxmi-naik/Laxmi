package com.xworksz.abstraction.media;

import com.xworksz.abstraction.PGRule;

public class PGRuleImpl implements PGRule {

	@Override
	public double costPerMonth() {
		System.out.println("running  costPerMonth method in PGRuleImpl");
		return 1000;
	}

	@Override
	public boolean wifi() {
		System.out.println("running  wifi method in PGRuleImpl");
		return true;
	}

}
