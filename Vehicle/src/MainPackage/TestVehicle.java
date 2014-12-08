package MainPackage;

import java.util.UUID;

public class TestVehicle {
	public static void main(String[] args) {
		Person a = new Person("Hugh", "Hefner", UUID.randomUUID());
		//Car
		Car newcar = new Car();
		newcar.NumberOfDoors = 4;
		newcar.transferOwnership(a);
		//Truck
		Truck newtruck = new Truck();
		newtruck.transferOwnership(a);
		newtruck.NumberOfAxels = 2;
		System.out.println("First owner of truck: "+newtruck.Owner.getFirstName()+" "+newtruck.Owner.getLastName());
		//Person B
		Person b = new Person("Squid", "Squad", UUID.randomUUID());
		//Transfer Ownership to B
		newtruck.transferOwnership(b);
		//Motorcycle w/o SideCar
		Motorcycle newmotorcycle = new Motorcycle();
		newmotorcycle.hasSideCar = false;
		System.out.println("Car has "+newcar.getNumberOfDoors()+" doors.");
		System.out.println("Second owner of truck: "+newtruck.Owner.getFirstName()+" "+newtruck.Owner.getLastName());
		System.out.println("Motorcycle has side car: "+newmotorcycle.isHasSideCar());
	}
}