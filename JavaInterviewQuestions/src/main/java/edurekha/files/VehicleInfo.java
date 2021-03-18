package edurekha.files;

import java.io.Serializable;

public class VehicleInfo implements Serializable{
	
	private String model;
	private String brand;
	private double mileage;
	
	
	public VehicleInfo(String model, String brand, double mileage) {
		super();
		this.model = model;
		this.brand = brand;
		this.mileage = mileage;
	}


	@Override
	public String toString() {
		return "VehicleInfo [model=" + model + ", brand=" + brand + ", mileage=" + mileage + "]";
	}
	
	
	
	

}
