class Country{
	public static void states(String[] statesName){
		System.out.println("rinning states in country");
		for(int statesNo=0;statesNo<statesName.length;statesNo++)
		{
		String stateName=statesName[statesNo];
		System.out.println(stateName);
		}
		System.out.println("++++++++++++++++");
		for(int statesNo=statesName.length-1;statesNo>=0;statesNo--)
		{
		String stateName=statesName[statesNo];
		System.out.println(stateName);
		}
		System.out.println("++++++++++++++++"); 
	}
	
	
	
	public static void pincode(int[] pincodeNo){
		System.out.println("running pincode in country");
		for(int pincode=0;pincode<pincodeNo.length;pincode++)
		{
			int pinNo=pincodeNo[pincode];
			System.out.println(pinNo);
		}
		System.out.println("++++++++++++++++");
		for(int pincode=pincodeNo.length-1;pincode>=0;pincode--)
		{
			int pinNo=pincodeNo[pincode];
			System.out.println(pinNo);
		}
		System.out.println("++++++++++++++++");
	}
	
	
	
	public static void primeminister(String[] primeministerName){
		System.out.println("running primeminister in country");
		for (int primeministerNo=0;primeministerNo<primeministerName.length;primeministerNo++)
		{
			String primeministersName=primeministerName[primeministerNo];
			System.out.println(primeministersName);
		}
		System.out.println("++++++++++++++++");
		for (int primeministerNo=primeministerName.length-1;primeministerNo>=0;primeministerNo--)
		{
			String primeministersName=primeministerName[primeministerNo];
			System.out.println(primeministersName);
		}
		System.out.println("++++++++++++++++");
	}
	
	
	public static void cabinetMinisters(String[] cabinetMinistersName){
		System.out.println("running cabinetMinisters in country ");
		for(int cabinetMinistersNo=0;cabinetMinistersNo<cabinetMinistersName.length;cabinetMinistersNo++ )
		{
			String cabinetMinisterName=cabinetMinistersName[cabinetMinistersNo];
			System.out.println(cabinetMinisterName);
		}
		System.out.println("++++++++++++++++");
		for(int cabinetMinistersNo=cabinetMinistersName.length-1;cabinetMinistersNo>=0;cabinetMinistersNo-- )
		{
			String cabinetMinisterName=cabinetMinistersName[cabinetMinistersNo];
			System.out.println(cabinetMinisterName);
		}
		System.out.println("++++++++++++++++");
	}
	
	
	
	public static void politicalParties(String[] politicalPartiesName){
		System.out.println("running politicalParties in country");
		for(int politicalPartiesNo=0;politicalPartiesNo<politicalPartiesName.length;politicalPartiesNo++)
		{
		String politicalPartyName=politicalPartiesName[politicalPartiesNo];
		System.out.println(politicalPartyName);
		}
		System.out.println("++++++++++++++++");
		for(int politicalPartiesNo=politicalPartiesName.length-1;politicalPartiesNo>=0;politicalPartiesNo--)
		{
		String politicalPartyName=politicalPartiesName[politicalPartiesNo];
		System.out.println(politicalPartyName);
		}
	}
	
	
}