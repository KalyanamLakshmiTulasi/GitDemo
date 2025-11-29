package javaPracticeLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Example1ArrayList {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the list");
		int size = sc.nextInt();
		int sum = 0;
		double avg = 0;
		
		System.out.println("Enter the values to be stored in ");
		ArrayList<Integer> alist = new ArrayList<>();
		for(int i=0; i<size; i++) {
			alist.add(sc.nextInt());
		}
		
		for (int i: alist)
			sum += i;
		
		avg = sum/size;
		
		System.out.println("The sum of elements is " + sum);
		System.out.println("Average of elements is " + avg);
		
		sc.close();
		
	}

}
