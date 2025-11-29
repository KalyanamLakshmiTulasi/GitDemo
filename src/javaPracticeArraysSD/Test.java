package javaPracticeArraysSD;

public class Test {

	public static void main(String[] args) {
		
	
		    int numbers[] = {3, 17, 13, 9, 18};
		    
		    System.out.println("First element is " + numbers[0]);
		    System.out.println("Second element is " + numbers[4]);

		    int sum =0;
		    
		    System.out.println("The reverse of array is:");
		    for (int i=4; i>=0 ;i--){
		        System.out.print(numbers[i] + " ");
		        sum = sum + numbers[i];
		    }
		    
		    System.out.println("The sum of elements is " + sum);
		    
		}

}
