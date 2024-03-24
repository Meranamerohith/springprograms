package com.sathya.springex;

public class Car implements Vehicle {
     private String fuelType;
     private int maxSpeed;
     
	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public void move() {
		System.out.println("You Selected Car Vehicle");
        System.out.println("Max Speed......"+maxSpeed);
        System.out.println("Fuel Type......"+fuelType);
	}

}
