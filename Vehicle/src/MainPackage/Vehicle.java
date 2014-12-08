package MainPackage;

public abstract class Vehicle {
	public String Name;
	public String Color;
	public double Weight;
	public Person Owner;

	Person driver_vec = new Person();

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public double getWeight() {
		return Weight;
	}

	public void setWeight(double weight) {
		Weight = weight;
	}

	public Person getOwner() {
		return Owner;
	}

	public void setOwner(Person owner) {
		Owner = owner;
	}

	public void transferOwnership(Person newOwner) {
		this.Owner = newOwner;
	}
}