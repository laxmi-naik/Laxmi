package com.xworks.interfaces.media;

import com.xworks.interfaces.RailwayStationRule;

public class RailwayStation implements RailwayStationRule {

	@Override
	public boolean noSmoking() {
		System.out.println("running noSmoking method in RailwayStation");
		return false;
	}

	@Override
	public boolean keepTheStationClean() {
		System.out.println("running keepTheStationClean method in RailwayStation");
		return false;
	}

	@Override
	public boolean noSpitting() {
		System.out.println("running noSpitting method in RailwayStation");
		return false;
	}

	@Override
	public boolean respectAnnouncements() {
		System.out.println("running respectAnnouncements method in RailwayStation");
		return false;
	}

	@Override
	public boolean noLittering() {
		System.out.println("running noLittering method in RailwayStation");
		return false;
	}

	@Override
	public boolean noUnauthorizedAccess() {
		System.out.println("running noUnauthorizedAccess method in RailwayStation");
		return false;
	}

	@Override
	public boolean followSecurityChecks() {
		System.out.println("running followSecurityChecks method in RailwayStation");
		return false;
	}

	@Override
	public boolean reportSuspiciousActivity() {
		System.out.println("running reportSuspiciousActivity method in RailwayStation");
		return false;
	}

	@Override
	public boolean noTrespassing() {
		System.out.println("running noTrespassing method in RailwayStation");
		return false;
	}

	@Override
	public boolean useFootbridges() {
		System.out.println("running useFootbridges method in RailwayStation");
		return false;
	}

	@Override
	public boolean validTickets() {
		System.out.println("running validTickets method in RailwayStation");
		return false;
	}

	@Override
	public boolean stayBehindTheYellowLine() {
		System.out.println("running stayBehindTheYellowLine method in RailwayStation");
		return false;
	}

	@Override
	public boolean noRunning() {
		System.out.println("running noRunning method in RailwayStation");
		return false;
	}

	@Override
	public boolean followBoardingInstructions() {
		System.out.println("running followBoardingInstructions method in RailwayStation");
		return false;
	}

	@Override
	public boolean respectSeatReservations() {
		System.out.println("running respectSeatReservations method in RailwayStation");
		return false;
	}

}
