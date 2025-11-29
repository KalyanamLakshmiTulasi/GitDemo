package javaPracticeExceptions;

import java.util.Scanner;

public class ExampleArthematicException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a = sc.nextInt();
		
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		int c = 0;
		
		try {
			c = a/b;
			System.out.println(c);
		}
		catch (ArithmeticException ae){
			System.out.println(ae);
		}
		finally {
			System.out.println("Program is not terminated");
		}
		
		sc.close();
	}
	

}
