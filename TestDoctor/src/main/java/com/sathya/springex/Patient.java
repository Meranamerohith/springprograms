package com.sathya.springex;

public class Patient {
        String name;
        int age;
        DoctorService doctor;
        PharmacyService pharma;
		public Patient(String name, int age, DoctorService doctor, PharmacyService pharma) {
			super();
			this.name = name;
			this.age = age;
			this.doctor = doctor;
			this.pharma = pharma;
		}
	public void patientDetails() {
		
		System.out.println("**************Patient Details:*****************");
		System.out.println("Patient Name:" +name);
		System.out.println("Patient Age :" +age);
		doctor.doctorInfo();
		pharma.pharmaInfo();
	}
        
}
