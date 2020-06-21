package Exercise_02;

public class Person {

	public enum GENDER{
		M, W
	}
	public String name;
	public int age;
	public String DNI;
	public char gender;
	public Double weight = 0.0;
	public Double height = 0.0;
	
	public Person(){
		this.name = "";
		this.age = 0;
		this.DNI = generateDNI();
		this.gender = String.valueOf(GENDER.M).charAt(0);
		this.weight = 0.0;
		this.height =0.0;
	}
	
	public Person(String name, int age, char gender){
		super();
		this.name = name;
		this.DNI = generateDNI();
		this.age = age;
		this.gender = checkGender(gender);
	}
	public Person(String name, int age, char gender, Double weight, Double height){
		this.name = name;
		this.age = age;
		this.DNI = generateDNI();
		this.gender = checkGender(gender);
		this.weight= weight;
		this.height = height; 
	}
	

	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDNI() {
		return DNI;
	}

	public char getGender() {
		return gender;
	}

	public Double getWeight() {
		return weight;
	}

	public Double getHeight() {
		return height;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public void setHeight(Double height) {
		this.height = height;
	}
	
	public Integer calculateIMC() {
		Double weightIdeal = (this.weight)/ Math.pow(this.height, 2);
		if(weightIdeal < 20) {
			return -1;
		}else if(weightIdeal > 20 && weightIdeal < 20) {
			return 0;
		}else {
			return 1;
		}
		
	}
	
	public boolean isAgeGrant() {
		if(this.age >= 18) return true;
		
		return false;
	}
	
	public char checkGender(char gender) {
		int count =0;
		for(GENDER a : GENDER.values())
			if(gender != String.valueOf(a).charAt(0) )
				count+=1;
		
		if(count>0)
			return String.valueOf(GENDER.M).charAt(0);
		
		return gender;
	}
	private String generateDNI(){
		String[] letters = {
				"T","R","W","A","G",
				"M","Y","F","P","D",
				"X","B","N","J","Z",
				"S", "Q", "V", "H",
				"L", "C", "K","E"
				};
		int max =99999999, min=10000000;
		int numberDNI = (int)(Math.random()*((max-min)+1)+min);
		int value = numberDNI % 23;
		return letters[value] +String.valueOf(numberDNI);
		
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", DNI=" + DNI + ", gender=" + gender + ", weight=" + weight
				+ ", height=" + height + "]";
	}


}
