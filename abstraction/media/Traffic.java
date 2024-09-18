package com.xworksz.abstraction.media;

import com.xworksz.abstraction.TrafficRule;

public class Traffic {
private TrafficRule trafficRule;
public void setTrafficRule(TrafficRule trafficRule) {
	this.trafficRule=trafficRule;
}
public void helmet() {
	if(trafficRule!=null) {
		System.out.println("running setTrafficRule method in Traffic");
		trafficRule.licenceNo();
	}
	else {
		System.out.println("trafficRule is null");
	}
}
}
