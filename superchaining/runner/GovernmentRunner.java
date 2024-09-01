package com.xworks.inheritance.superchaining.runner;

import com.xworks.inheritance.superchaining.CentrlGovernment;
import com.xworks.inheritance.superchaining.StateGovernment;

public class GovernmentRunner {

	public static void main(String[] args) {
		StateGovernment stateGovernment=new StateGovernment("karnataka","dk shivakumar");
	    stateGovernment.show();
		
		StateGovernment stateGovernment1=new StateGovernment("goa","amit patkar");
	    stateGovernment1.show();
		
		
		CentrlGovernment centrlGovernment =new CentrlGovernment(" b y vijayendra","gangadharaiah");
		centrlGovernment.show();
		CentrlGovernment centrlGovernment1 =new CentrlGovernment("ravi naik","pramod sawant");
		centrlGovernment1.show();
		
	}

}
