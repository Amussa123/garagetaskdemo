package com.qa.runner;

import java.util.ArrayList;

import com.qa.vehicle.Bike;
import com.qa.vehicle.Car;
import com.qa.vehicle.MotorBike;
import com.qa.vehicle.garage;
import com.qa.vehicle.motorVehicles;


public class runner {

	public static void main(String[] args) {
		
		ArrayList<motorVehicles> motorvehicleslist = new ArrayList<>();

		Car Toyota = new Car("car", "4 wheels", "Has An Engine", 4, true );
		Car ReliantRobin = new Car("car", "3 wheels", "Has An Engine", 2, true );
		Bike RoadBike = new Bike("bike", "2 wheels", "Has no Engine", 2, false);
		Bike EMountainBike = new Bike("bike", "2 wheels", "Has Engine", 2, true);
		MotorBike SportsBike = new MotorBike("MotorBike", "2 wheels", "Has an Engine", 2, true);
		MotorBike MIBBike = new MotorBike("MotorBike", "1 wheels", "Has No Engine", 0, false);

		garage newManager = new garage();
		
		newManager.addmotorVehicles(ReliantRobin);
		newManager.addmotorVehicles(Toyota);
		newManager.addmotorVehicles(RoadBike);
		newManager.addmotorVehicles(EMountainBike);
		newManager.addmotorVehicles(SportsBike);
		newManager.addmotorVehicles(MIBBike);
		
		
		
		
		motorvehicleslist.add(MIBBike);
		System.out.println(motorvehicleslist);
		
		
		
		
		
		
		
		
	}

}
