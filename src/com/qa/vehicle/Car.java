package com.qa.vehicle;

public class Car extends motorVehicles{
	
	private boolean AirCon;
	private int windows;

	public Car (String Type, String NumberOfWheels, String engine, int windows, boolean AirCon) {
		
		this.Type = Type;
		this.NumberOfWheels = NumberOfWheels;
		this.engine = engine;
		this.windows = windows;
		this.AirCon = AirCon;
		
		
	}

	public boolean isAirCon() {
		return AirCon;
	}

	public void AirCon(boolean airCon) {
		AirCon = airCon;
	}

	public int Windows() {
		return windows;
	}

	public void Windows(int windows) {
		this.windows = windows;
	}

	@Override
	public String toString() {
		return "Car [AirCon=" + AirCon + ", windows=" + windows + ", Type=" + Type + ", NumberOfWheels="
				+ NumberOfWheels + ", engine=" + engine;
	}

	
	
	
	

//	public Car(Boolean Engine) {
//		super(Engine);
//		System.out.println("True");
//	
//	}
//	
//	public Car(int NumberOfWheels) {
//		super(NumberOfWheels);
//		System.out.println(4);
//		
//	}

	
		
	}
		
	

