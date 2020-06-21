package Exercise_05;

public class Student extends Person{

	private double grade;
	private double availability;
	
	public Student(String name, int age, char gender, double grade) {
		super(name, age, gender);
		this.grade =grade;
		this.availability = availability();
	}
	
	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	public double getAvailability() {
		return availability;
	}
	private double availability() {
		return this.availability= Math.random();
	}
	public boolean haveApproved() {
		if(grade>=7)
			return true;
		return false;
	}


}
