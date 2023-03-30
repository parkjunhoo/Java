package test;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		
		Taxi taxi = new Taxi(new Point(7,5) , 100,1900);
		//taxi.setTaxifare(1900);
		taxi.run(1);
		
		Truck truck = new Truck(new Point(10,12) , 80,2000);
		//truck.setWeight(2000);
		truck.run(2);
		
		carList.add(taxi);
		carList.add(truck);
		
		Car.printTitle();
		for(Car car: carList) {
			car.print();
		}
			
	}

}
