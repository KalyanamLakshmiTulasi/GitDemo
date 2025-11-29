package javaPracticeLists;

import java.util.ArrayList;
import java.util.List;

public class Example4ArrayList {

	public static void main(String[] args) {
		
		List<Integer> alist1 = new ArrayList<> (List.of(4,9,8));
		List<Integer> alist2 = new ArrayList<> (List.of(5,0,10));
		
		alist1.addAll(alist2);
		
		System.out.println(alist1);
		
		
	}

}
