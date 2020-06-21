package Exercise_05;

public class Teacher extends Person{
	public double availability;
	
	public Teacher(String name, int age, char gender) {
		super(name, age, gender);
		this.availability = availability();
	}

	public double getAvailability() {
		return availability;
	}
	private double availability() {
		return this.availability= Math.random();
	}
}
