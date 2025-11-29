package javaPracticeCollections;

import java.util.*;

public class VectorPractice {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();
		Vector<Integer> v1 = new Vector<>();
		System.out.println(v.capacity());
		v.add(3);
		v.add(4);
		v.add(0, 7);
		v1.addAll(v);
		System.out.println(v.size());
		System.out.println(v1.capacity());

	}

}
