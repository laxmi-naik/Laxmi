class CountryRunner{
	public static void main(String[] args){
		System.out.println("running main in CountryRunner");
		
		String[] statesName={"Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat",
		"Haryana", "Himachal Pradesh","Jammu and Kashmir", "Jharkhand"," Karnataka", "Kerala", "Madhya Pradesh"," Maharashtra", "Manipur",
		"Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", 
		"Telangana", "Tripura"," Uttar Pradesh","Uttarakhand","West Bengal" };
		Country.states(statesName);
		
		
		
		int[] pincodeNo={587316,587124,587315,560091,560030,560007,560045,560086,560050,560070,560085};
		Country.pincode(pincodeNo);
		
		String[] primeministerName={"Jawaharlal Nehru","Indira Gandhi",	"Narendra Modi","Manmohan Singh","Atal Bihari Vajpayee","Rajiv Gandhi"	,
		"P. V. Narasimha Rao","Morarji Desai","Lal Bahadur Shastri","Vishwanath Pratap Singh","Inder Kumar Gujral",	"H. D. Deve Gowda",	
		"Chandra Shekhar"	,"Charan Singh",	"Gulzarilal Nanda"};
		Country.primeminister(primeministerName);
		
		
		String[] cabinetMinistersName={"Shri Rajnath Singh","Shri Amit Shah","Shri Nitin Jairam Gadkari","Smt. Nirmala Sitharaman",	
"Shri Shivraj Singh Chouhan","Dr. Subrahmanyam Jaishankar","Shri Jagat Prakash Nadda",	 
"Shri Manohar Lal","Shri H. D. Kumaraswamy"	,"Shri Piyush Goyal","Shri Dharmendra Pradhan",
"Shri Jitan Ram Manjhi",	"Shri Rajiv Ranjan Singh alias Lalan Singh","Shri Sarbananda Sonowal","Dr Virendra Kumar",	"Shri Kinjarapu Rammohan Naidu",	"Shri Pralhad Joshi","Shri Jual Oram",	
"Shri Giriraj Singh","Shri Ashwini Vaishnaw","Shri Jyotiraditya M. Scindia",	 
"Shri Bhupender Yadav","Shri Gajendra Singh Shekhawat","Smt. Annpurna Devi",	
"Shri Kiren Rijiju","Shri Hardeep Singh","Dr. Mansukh Mandaviya","Shri G. Kishan Reddy","Shri Chirag Paswan","Shri C R Patil"};
      Country.cabinetMinisters(cabinetMinistersName);
	  
	  
	  String[] politicalPartiesName={"BJP","BSP Bahujan Samaj Party ", "CPI Communist Party of India" , "CPM Communist Party of India (Marxist)","congress"};
	  Country.politicalParties(politicalPartiesName);
	}
}