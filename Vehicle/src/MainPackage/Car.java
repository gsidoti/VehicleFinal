package MainPackage;

public class Car extends Vehicle implements VehicleInterface {
	public int NumberOfDoors;

	public Car() {

	}

	public Car(int NumberOfDoors) {
		this.NumberOfDoors = NumberOfDoors;
	}

	public int getNumberOfDoors() {
		return NumberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		NumberOfDoors = numberOfDoors;
	}

	@Override
	public void transferOwnership(Person newOwner) {
		Owner = newOwner;
	}

}
