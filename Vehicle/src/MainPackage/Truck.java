package MainPackage;

public class Truck extends Vehicle implements VehicleInterface {
	public int NumberOfAxels;

	public Person newOwner;

	public Truck() {
	}

	public Truck(int NumberOfAxels, Person Owner) {
		this.NumberOfAxels = NumberOfAxels;
		this.Owner = Owner;
	}

	public int getNumberOfAxels() {
		return NumberOfAxels;
	}

	public void setNumberOfAxels(int numberOfAxels) {
		NumberOfAxels = numberOfAxels;
	}

	public Person ownership(Person newOwner) {
		super.transferOwnership(newOwner);
		return newOwner;
	}

}