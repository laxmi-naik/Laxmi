package com.xworksz.abstraction.media;

import com.xworksz.abstraction.MallRule;

public class MallRuleImpl  implements MallRule{

	@Override
	public boolean validId() {
		System.out.println("running validId method in MallRuleImpl");
		return true;
	}

}
