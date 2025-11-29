package javaPracticeStaticNonStatic;

public class Counter {

	static int count = 1;
	
	public Counter() {
		System.out.println(count);
		count++;
	}
	
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		Counter c4 = new Counter();
		Counter c5 = new Counter();
	}
}
