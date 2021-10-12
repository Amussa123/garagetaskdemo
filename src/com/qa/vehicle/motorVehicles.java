package com.qa.vehicle;

public class motorVehicles extends garage{
	
	String Type;
    String NumberOfWheels;
    String engine;

    public String Type() {
        return Type;
    }

    public void Type(String Type) {
        this.Type = Type;
    }

    public String NUmberOfWheels() {
        return NumberOfWheels;
    }

    public void Name(String NumberOfWheels) {
        this.NumberOfWheels = NumberOfWheels;
    }

    public String Engine() {
        return engine;
    }

    public void EngineSize(String engine) {
        this.engine = engine;
    }

	@Override
	public String toString() {
		return "motorVehicles [Type=" + Type + ", NumberOfWheels=" + NumberOfWheels + ", engine=" + engine + ", Type()="
				+ Type() + ", NUmberOfWheels()=" + NUmberOfWheels() + ", Engine()=" + Engine() + "]";
	}
    
//    public int CalcBIll() {
//    	
    	
	
    	
    }

    
    
	
