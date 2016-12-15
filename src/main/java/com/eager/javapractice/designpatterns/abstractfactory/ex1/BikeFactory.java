package com.eager.javapractice.designpatterns.abstractfactory.ex1;

public class BikeFactory implements VehicleFactory{

	public Vehicle createVehicle() {
		return new Bike();
	}

}
