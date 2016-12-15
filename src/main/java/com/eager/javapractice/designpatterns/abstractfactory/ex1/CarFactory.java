package com.eager.javapractice.designpatterns.abstractfactory.ex1;

public class CarFactory implements VehicleFactory{

	public Vehicle createVehicle() {
		return new Car();
	}

	
}
