package com.sathya.springex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	    
	
	    @Autowired
         HomeLoanService homeLoanService;
	    @Autowired
         RealEstateService realEstateService;
         
			/*
			 * @Autowired public Person(HomeLoanService homeLoanService, RealEstateService
			 * realEstateService) { super(); this.homeLoanService = homeLoanService;
			 * this.realEstateService = realEstateService; }
			 */


		/*
		 * public HomeLoanService getHomeLoanService() { return homeLoanService; }
		 * 
		 * @Autowired public void setHomeLoanService(HomeLoanService homeLoanService) {
		 * this.homeLoanService = homeLoanService; }
		 * 
		 * 
		 * public RealEstateService getRealEstateService() { return realEstateService; }
		 * 
		 * @Autowired public void setRealEstateService(RealEstateService
		 * realEstateService) { this.realEstateService = realEstateService; }
		 */
        public void personInfo() {
        	homeLoanService.LoanInfo();
        	realEstateService.realEstateInfo();
        }
}
