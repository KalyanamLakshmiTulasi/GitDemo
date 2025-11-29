package javaPracticeLists;

import java.util.*;

public class Example3ArrayList {

	public static void main(String[] args) {
		
		List<Integer> alist = new ArrayList<> (List.of(4,9,8,5,0,10));
		int middleIndex = alist.size()/2;
		
		List<Integer> first = new ArrayList<> (alist.subList(0, middleIndex));
		List<Integer> second = new ArrayList<> (alist.subList(middleIndex,alist.size()));
		
		System.out.println(first);
		System.out.println(second);	
		
		}	

	}
