package Exercise_05;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Teacher[] teachers = new Teacher[4];
		teachers[0] = new Teacher("mata", 25, "M".charAt(0));
		teachers[1] = new Teacher("naa", 35, "M".charAt(0));
		teachers[2] = new Teacher("Shigeru", 45, "F".charAt(0));
		teachers[3] = new Teacher("Landoi", 25, "F".charAt(0));
		
		Student[] students = new Student[10];
		students[0] = new Student("mata", 25, "M".charAt(0), 8);
		students[1] = new Student("naa", 35, "M".charAt(0),6.9);
		students[2] = new Student("Shigeru", 45, "F".charAt(0), 7);
		students[3] = new Student("Landoi", 25, "F".charAt(0),9);
		students[4] = new Student("mata a", 25, "M".charAt(0), 5);
		students[5] = new Student("naa a", 35, "M".charAt(0),6.4);
		students[6] = new Student("Shigeru L", 45, "F".charAt(0), 8.3);
		students[7] = new Student("Landoi m", 25, "F".charAt(0),4.5);
		students[8] = new Student("mata i", 25, "M".charAt(0), 6.7);
		students[9] = new Student("naa j", 35, "M".charAt(0),4.6);
		
		Assignature[] assignatures = new Assignature[3];
		assignatures[0] = new Assignature("Phylosophy");
		assignatures[1] = new Assignature("Physics");
		assignatures[2] = new Assignature("Math");
		
		Classroom[] classrooms = new Classroom[3]; 
		classrooms[0]= new Classroom(1, 5, assignatures[0], teachers[0], maxStudents(students, 5));
		classrooms[1] = new Classroom(2, 5, assignatures[1], teachers[1], maxStudents(students, 5));
		classrooms[2] = new Classroom(3, 4, assignatures[2], teachers[2], maxStudents(students, 4));

		for(Classroom classroom : classrooms) {
		if(classroom.isPossibleGetClass()) {
			JOptionPane.showMessageDialog(null, "The class of "
			+ classroom.asignature.getName()+" has approved "+classroom.studentsApproved()
			+" people \nthis are the grades of students: ");
			for(Student s: classroom.students) {
				if(s.haveApproved())
					JOptionPane.showMessageDialog(null, "The student named: "+s.getName()+ " has "+ s.getGrade()+ "/10\nCongratulation");
			}
		}else {
			JOptionPane.showMessageDialog(null, "Sorry, but the class of "
					+ classroom.asignature.getName()+ " can't dictared");
		}
		}
	}
	
	public static Student[] maxStudents(Student[] allStudents, int max_s) {
		Student [] newStudents= new Student[max_s];
		int number, max =9, min=0;
		for(int i=0; i<max_s; i++) {
			number = (int)(Math.random()*((max-min)+1)+min);
			newStudents[i] = allStudents[number]; 
		}
		return newStudents;
	}

}
