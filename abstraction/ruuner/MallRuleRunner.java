package com.xworksz.abstraction.ruuner;

import com.xworksz.abstraction.MallRule;
import com.xworksz.abstraction.media.Mall;
import com.xworksz.abstraction.media.MallRuleImpl;

public class MallRuleRunner {

	public static void main(String[] args) {
		MallRule mallRule=new MallRuleImpl();
		Mall mall=new Mall();
		mall.setMallRule(mallRule);
		mall.vandalism();

	}

}
