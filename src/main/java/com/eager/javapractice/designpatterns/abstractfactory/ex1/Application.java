package com.eager.javapractice.designpatterns.abstractfactory.ex1;

public class Application {

	
	VehicleFactory vehicleFactory;
	public Application(VehicleFactory factory) {
		this.vehicleFactory= factory;
	}

	public static void main(String[] args) {
		
		Application app = new Application(new CarFactory());
		Vehicle vehcile=app.getVehicleFactory().createVehicle();
		System.out.println("The Model of the Vehicle:-"+vehcile.getVehicleModel());
		System.out.println("The CC strength of the Vehicle:-"+vehcile.getCCInfo());
	}
	
	public VehicleFactory getVehicleFactory(){
		
		return vehicleFactory;
	}
}
