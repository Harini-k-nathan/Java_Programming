package basicweb;

import java.lang.System;
import java.util.Scanner;

public class UserInputMarksIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int mark = scan.nextInt();
		if(mark>34) {
			System.out.println("Pass");
			
		}
		else {
			System.out.println("fail");
		}

		
		
		int income = scan.nextInt();
		if (income>6999) {
			 System.out.println("Scholarship is available");
			
		}
		else {
			
			System.out.println("Scholarship is not available");
		}
		
		int divisiblenumber = scan.nextInt();
		
		
		if(divisiblenumber%3 == 0 && divisiblenumber%5 == 0) {
			System.out.println("The number is divisible by 3 and 5");
		}
		
		else {
			System.out.println("The number is not divisible by 3 and 5");
		}
		
		
		
		int even = scan.nextInt();
		
		if (even%2 == 0) {
			System.out.println("This is a even number");
		}
		else {
			System.out.println("This is an odd number");
		}
		
		
		
	}

	
	
	
}