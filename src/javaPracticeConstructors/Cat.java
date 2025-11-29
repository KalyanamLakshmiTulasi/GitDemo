package javaPracticeConstructors;

public class Cat {
	
	String name;
	int age;
	
	public Cat() {
		System.out.println("In constructor");
	}

	public static void main(String[] args) {
		
		Cat c = new Cat();
		
		System.out.println("Name is " + c.name);
		System.out.println("Age is " + c.age);

	}

}
