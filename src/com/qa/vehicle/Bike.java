package com.qa.vehicle;

public class Bike extends motorVehicles{
	
	
	private boolean HelmetHolder;
	private int Pedals;

	public Bike (String Type, String NumberOfWheels, String engine, int Pedals, boolean HelmetHolder) {
		
		this.Type = Type;
		this.NumberOfWheels = NumberOfWheels;
		this.engine = engine;
		this.HelmetHolder = HelmetHolder;
		this.Pedals = Pedals;
		
	}

	public boolean HelmetHolder() {
		return HelmetHolder;
	}

	public void HelmetHolder(boolean helmetHolder) {
		HelmetHolder = helmetHolder;
	}

	public int Pedals() {
		return Pedals;
	}

	public void Pedals(int pedals) {
		Pedals = pedals;
	}

	@Override
	public String toString() {
		return "Bike [HelmetHolder=" + HelmetHolder + ", Pedals=" + Pedals + ", Type=" + Type + ", NumberOfWheels="
				+ NumberOfWheels + ", engine=" + engine ;
	}
	
	
//	public String Bills() {
//		return "vehicle" + Type;
//	}
//	
}
	
	
	
	

//	public Bike(Boolean Engine) {
//		super(Engine);
//		System.out.println("False");
//	}
//	
//	public Bike(int NumberOfWheels) {
//		super(NumberOfWheels);
//		System.out.println(2);
	
	


