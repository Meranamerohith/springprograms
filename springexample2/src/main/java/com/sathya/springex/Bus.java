package com.sathya.springex;

public class Bus implements Vehicle {
	private String busType;
	private String maxSpeed;

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public void move() {
		System.out.println("You Selected Bus Vehicle");
		System.out.println("Max Speed........"+maxSpeed);
		System.out.println("Bus Type.........."+busType);
	}

}
