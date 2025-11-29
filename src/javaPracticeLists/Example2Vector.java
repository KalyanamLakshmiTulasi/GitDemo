package javaPracticeLists;

import java.util.*;

public class Example2Vector {

	public static void main(String[] args) {
		
		Vector<Integer> vlist = new Vector<> (List.of(4,5,0,9,8,10));
		
		int sum = 0;
		
		for(int i=0; i<vlist.size(); i++) {
			if(vlist.get(i)%2==0) {
				sum += vlist.get(i);
			}
		}
		
		System.out.println("Sum of even numbers in a list is " + sum);	

	}

}
