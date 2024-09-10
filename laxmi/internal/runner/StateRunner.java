package com.xworks.laxmi.internal.runner;

import com.xworks.laxmi.internal.State;

public class StateRunner {

	public static void main(String[] args) {
		State State1 =new State("karnataka", "bengaluru", 8, 31, 29, 12455815);
		State State2 =new State("karnataka", "bengaluru", 8, 31, 29, 12455815);
        boolean ref=State1.equals(State2);
        System.out.println("State1 rquals to State2:"+ref);
	}

}
