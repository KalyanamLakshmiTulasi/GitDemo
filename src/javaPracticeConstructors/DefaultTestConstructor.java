package javaPracticeConstructors;

public class DefaultTestConstructor {

	String title;
	String author;
	double price;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book();
		System.out.println("The deafult book is " + book1.title + " and it's written by " + book1.author + " and priced at Rs." + book1.price );

	}

}
