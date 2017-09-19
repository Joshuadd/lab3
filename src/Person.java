public class Person {
	static int currentYear = 2017;
	private String name;
	private int birthday;
	private int age;
	
	//constructor
	public Person(String name, int birthday){
		this.name = name;
		this.birthday = birthday;
	}

	
	public void reset_birthday(int year){
		birthday = year;
	}
	
	public void displayInfo() { //Displays all the info about the person
		System.out.println("This is " + name);
		System.out.printf("I was born in %d. ",birthday);
		age = getAge(birthday);
		System.out.printf("I am %d years old ",age);
		printIfSenior();
	}
	
	public int getAge(int bday) { //Returns the age of a person with the given birthday
		return currentYear - bday;
	}
	
	public void printIfSenior() { //Prints whether the person is a senior or not
		if (age >= 65){
			System.out.println("\nI'm a senior citizen");
		}
		else{
			System.out.println("\nI'm not old enough to be classified as a senior by Medicare!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person John = new Person("John",1957);
		John.displayInfo();
		
		
	}

}