package com.sathya.springex;

public class PharmacyService {
      String pharmaLocation;
      String pharmaName;

	
      
      public PharmacyService(String pharmaLocation, String pharmaName) {
		super();
		this.pharmaLocation = pharmaLocation;
		this.pharmaName = pharmaName;
	}



	public void pharmaInfo() {
		  System.out.println("****************Pharmacy Details:**************");
    	  System.out.println("Pharmacy Located At:" +pharmaLocation);
    	  System.out.println("Pharmacy Name      :" +pharmaName);
      }
}
