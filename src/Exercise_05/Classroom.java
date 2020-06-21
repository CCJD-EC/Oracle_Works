package Exercise_05;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Classroom {
	public int id;
	public int maxStudents;
	public Assignature asignature;
	public Teacher professor;
	public Student[] students;
	
	
	public Classroom(int id, int maxStudents, Assignature asignature, Teacher professor, Student[] students) {
		super();
		this.id = id;
		this.maxStudents = maxStudents;
		this.asignature = asignature;
		this.professor = professor;
		this.students = CheckMaxStudents(students);
	}
	public int getId() {
		return id;
	}
	public int getMaxStudents() {
		return maxStudents;
	}
	public Assignature getAsignature() {
		return asignature;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}
	public void setAsignature(Assignature asignature) {
		this.asignature = asignature;
	}
	
	
	public boolean isProfessourAvailable() {
		System.out.println("isProfessourAvailable: " +professor.availability*100);
		if((professor.availability*100) > 20)
			return true;
		return false;
	}
	
	public boolean isStudentsAvailable() {
		double availablility = 0.0;
		for(Student student : students) 
			availablility += (student.getAvailability()*100);
		
		System.out.println("isStudentsAvailable: " +availablility/students.length);
		if((availablility/students.length) > 50)
			return true;
		return false;
	}
	
	public boolean isPossibleGetClass() {
		if (isProfessourAvailable() && isStudentsAvailable())
			return true;
		return false;
	}
	
	public Student[] CheckMaxStudents(Student[] students) {
		if(students.length <= maxStudents) {
			return students;
		}
		return null;
	}
	public int studentsApproved() {
		int appreved=0;
		for(Student s: students)
			if(s.haveApproved())
				appreved +=1;
		return appreved;
	}
	
}
