package com.sathya.springex;

public class DoctorService {
     int docId;
     String docName;
	public DoctorService(int docId, String docName) {
		super();
		this.docId = docId;
		this.docName = docName;
	}
     
     public void doctorInfo() {
    	 System.out.println("****************Doctor Details:****************");
    	 System.out.println("Doctor ID  :" +docId);
    	 System.out.println("Doctor Name:" +docName);
     }
}
