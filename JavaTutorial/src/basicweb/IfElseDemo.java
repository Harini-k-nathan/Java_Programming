package basicweb;

import java.lang.System;
import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean rain = false;
		
		if(rain) {
			
			System.out.println("Take an umbrella");
		}
		
		else {
			
			System.out.println("Enjoy the Sunlight");
		}
		
		
		// which one is greater
		
		int num1 = 30;
		int num2 = 20;
		
		if(num2>num1) {
			
			System.out.println("Num2 is greater");
		}
		else {
			System.out.println("Num1 is greater");
		}
		
		
//compare two number, put == to represent equals to, to assign values we can use = one equals to symbol
		
		
		int num3 = 50;
		int num4 = 120;
		
		if(num3==num4) {
			System.out.println("Num 3 and 4 are equal");
		}
		else {
			System.out.println("Num 3 and 4 are not equal");
		}
		
	// compare using user input	
		
		Scanner scan = new Scanner(System.in);
		
		int num5 = scan.nextInt();
		int num6 = scan.nextInt();
		
		if(num5==num6) {
			System.out.println("Num 5 and 6 are equal");
		}
		else {
			System.out.println("Num 5 and 6 are not equal");
		}
		
		
		
		
	}
	
	
	
	

}