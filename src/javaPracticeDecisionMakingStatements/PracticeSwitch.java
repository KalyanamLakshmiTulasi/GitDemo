package javaPracticeDecisionMakingStatements;

import java.util.Scanner;

public class PracticeSwitch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		switch(s) {
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday":
		{
			System.out.println("Uff, it's weekday");
			break;
		}
		case "Saturday":
		case "Sunday":
		{
			System.out.println("Yay, it's weekend");
			break;
		}
		default:
			System.out.println("Invalid input");
		}
		
		sc.close();

	}

}
