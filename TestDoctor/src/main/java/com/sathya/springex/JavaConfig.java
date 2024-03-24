package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
      
	@Bean
	DoctorService doctorService() {
		DoctorService doctorService = new DoctorService(22, "SAI ROHITH");
		return doctorService;
	}
	
	@Bean 
	PharmacyService pharmacyService() {
		PharmacyService pharmacyService = new PharmacyService("Hyderabad","Apollo");
		return pharmacyService;
	}
	
	@Bean
	Patient patient() {
		Patient patient = new Patient("Venkat", 77, doctorService(),pharmacyService());
		return patient;
	}
	    
}
