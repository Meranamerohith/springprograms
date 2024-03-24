package com.sathya.springex;

public class Traveller {
	
	private String name;
	private String email;
	private long mobile;
	Vehicle vehicle;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void StartJourney() {
		System.out.println("Hey  "+name+"  Welcome to travel World");
		System.out.println("Check your mobile..... "+mobile+" email id....."+email);
	}
}
