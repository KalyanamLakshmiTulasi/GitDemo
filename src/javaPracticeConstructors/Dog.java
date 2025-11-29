package javaPracticeConstructors;

public class Dog {
	
	String name;
	String colour;

	public Dog(String name, String colour) {
		this.name = name;
		this.colour = colour;
	}
	

	public Dog() {
		name = "Maverick";
		colour = "Black";
	}
	

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("Latte","Brown");
		Dog dog2 = new Dog();
		
		System.out.println("Dog's name is " + dog1.name);
		System.out.println("Dog's colour is " + dog2.colour);
		
	}

}
