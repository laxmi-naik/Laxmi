package com.xworksz.abstraction.media;

import com.xworksz.abstraction.TrafficRule;

public class RoadTrafficRuleImpl  implements TrafficRule{

	@Override
	public String licenceNo() {
		System.out.println("running licenceNo method in RoadTrafficRuleImpl");
		return null;
	}

}
