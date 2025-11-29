package javaPracticeLists;

import java.util.*;

public class Example5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the list");
		int size = sc.nextInt();
		
		System.out.println("Enter the elements of the list");
		List<String> alist = new ArrayList<>();
		for (int i=0;i<size;i++) {
			alist.add(sc.nextLine());
			}
		
		System.out.println(alist);
		sc.close();
		
		
	}	

}
