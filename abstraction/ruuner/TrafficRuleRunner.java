package com.xworksz.abstraction.ruuner;

import com.xworksz.abstraction.TrafficRule;
import com.xworksz.abstraction.media.RoadTrafficRuleImpl;
import com.xworksz.abstraction.media.Traffic;

public class TrafficRuleRunner {

	public static void main(String[] args) {
		TrafficRule trafficRule=new RoadTrafficRuleImpl();
		Traffic traffic=new Traffic();
		traffic.setTrafficRule(trafficRule);
		traffic.helmet();
	}

}
