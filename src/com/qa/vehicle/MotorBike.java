package com.qa.vehicle;

public class MotorBike extends motorVehicles{
	
	private boolean Throttle;
	private int KickStands;

	public MotorBike (String Type, String NumberOfWheels, String engine, int KickStands, boolean Throttle) {
		
		this.Type = Type;
		this.NumberOfWheels = NumberOfWheels;
		this.engine = engine;
		this.Throttle = Throttle;
		this.KickStands = KickStands;
	
	
	}

	public boolean isThrottle() {
		return Throttle;
	}

	public void setThrottle(boolean throttle) {
		Throttle = throttle;
	}

	public int getKickStands() {
		return KickStands;
	}

	public void setKickStands(int kickStands) {
		KickStands = kickStands;
	}

	@Override
	public String toString() {
		return "MotorBike [Throttle=" + Throttle + ", KickStands=" + KickStands + ", Type=" + Type + ", NumberOfWheels="
				+ NumberOfWheels + ", engine=" + engine;
	}

	
	
	}
	
	

	
	
	
	
	
	
	
//
//	public MotorBike(Boolean Engine) {
//		super(Engine);
//		System.out.println("True");
//	}
//	
//	public MotorBike(int NumberOfWheels) {
//		super(NumberOfWheels);
//		System.out.println(2);
	
	


