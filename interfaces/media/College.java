package com.xworks.interfaces.media;

import com.xworks.interfaces.CollegeRule;

public class College implements CollegeRule {

	@Override
	public boolean id() {
	System.out.println("running id method in college");
		return false;
	}

	@Override
	public boolean noharassment() {
		System.out.println("running noharassment method in college");
		return false;
	}

	@Override
	public boolean attendance() {
		System.out.println("running attendance method in college");
		return false;
	}

	@Override
	public boolean submitAssignment() {
		System.out.println("running submitAssignment method in college");
		return false;
	}

	@Override
	public boolean noSmoking() {
		System.out.println("running noSmoking method in college");
		return false;
	}

	@Override
	public boolean dressCode() {
		System.out.println("running dressCode method in college");
		return false;
	}

	@Override
	public boolean respectCampusProperty() {
		System.out.println("running respectCampusProperty method in college");
		return false;
	}

	@Override
	public boolean cleanliness() {
		System.out.println("running cleanliness method in college");
		return false;
	}

	@Override
	public boolean onTime() {
		System.out.println("running onTime method in college");
		return false;
	}

	@Override
	public boolean respectFaculty() {
		System.out.println("running respectFaculty method in college");
		return false;
	}

}
