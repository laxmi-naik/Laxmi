package com.xworksz.abstraction.media;

import com.xworksz.abstraction.MallRule;

public class Mall {
private MallRule mallRule;
public void setMallRule(MallRule mallRule) {
	this.mallRule=mallRule;
}
public void vandalism() {
	if( mallRule!=null) {
		System.out.println("running vandalism method in Mall");
		mallRule.validId();
	}
	else {
		System.out.println("mallRule is null");
	}
}
}
