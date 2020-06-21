package Exercise_02;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		Person [] person = new Person[3];
		try {
		/*
		 * Put values in the difference variables asked 
		 * And insert values for keyboard
		 * 
		 */
			String name = inputData("Input your name:");
			int age = Integer.parseInt(inputData("Input your age:"));
			char gender = inputData("Input your gender"
				+ "(Only \"M\" for MAN or \"W\" for WOMAN):").charAt(0);
			double weight = Double.parseDouble(inputData("Input your weight in kg:"));
			double height = Double.parseDouble(inputData("Input your height in meters:"));
		
			/*
			 * Initialize person object values
			 * Use the three different constructors  
			 * 
			 */
			person[0] = new Person(name, age, gender, weight,height);
			person[1] = new Person("another "+name, age, gender);
			person[2] = new Person();
			
			/*
			 * Add values to third person
			 * 
			 * */
			person[2].setName("ANOTHER MARICO");
			person[2].setAge(40);
			person[2].setGender("W".charAt(0));
			person[2].setWeight(30.2);
			person[2].setHeight(3.5);
			
			/*
			 * Check the ideal weight
			 * 
			 * */
			whatIsMyIMS(person);
			
			/*
			 * Check the gender
			 * 
			 * */
			
			MyAgeIsCorrect(person);
			
			/*
			 * All information of each people
			 * 
			 * */
			for(Person p: person)
				JOptionPane.showMessageDialog(null, "Information: \n" + p.toString());
			
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Something finished bad, please try again\n Error:"+ e);
		}
	
	}
	/*
	 * Display messages
	 * 
	 * */
	
	public static String inputData(String message) {
		return JOptionPane.showInputDialog(message);
	}
	/*
	 * Display checking IMS of everyone
	 * 
	 * */
	public static void whatIsMyIMS(Person[] people) {
		
		for(Person a : people)
			switch (a.calculateIMC()) {
			case 1:
				JOptionPane.showMessageDialog(null, "The person named: "+ a.getName()+ " has overweight");
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "The person named: "+ a.getName()+ " has down of ideal weight");
				break;
			case -1:
				JOptionPane.showMessageDialog(null, "The person named: "+ a.getName()+ " has serious problem");
				break;

			default:
				break;
			}
	}
	/*
	 * Display if the people are adult
	 * 
	 * */
	
	public static void MyAgeIsCorrect(Person [] people) {
		for(Person a: people)
			if(a.isAgeGrant()) {
				JOptionPane.showMessageDialog(null, "The person named: "+a.getName()+" is adult");
			}else {
				JOptionPane.showMessageDialog(null, "The person named: "+a.getName()+" isn't adult");
			}
	}


}
