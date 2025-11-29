package javaPracticeConstructors;


public class Book {

	String title;
	String author;
	double price;

	public Book() {
		title = "Unknown";
		author = "Unknown";
		price = 0.0;
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		price = 350.0;
	}

	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public static void main(String[] args) {

		Book book1 = new Book();
		Book book2 = new Book("Thousand Splendid Suns", "Khaled Hosseini");
		Book book3 = new Book("The Kite Runner", "Khaled H", 300.0);

		System.out.println("The deafult book is " + book1.title + " and it's written by " + book1.author + " and priced at Rs." + book1.price );
		System.out.println("The second book is " + book2.title + " and it's written by " + book2.author + " and priced at Rs." + book2.price );
		System.out.println("The third book is " + book3.title + " and it's written by " + book3.author + " and priced at Rs." + book3.price );
	}

}
