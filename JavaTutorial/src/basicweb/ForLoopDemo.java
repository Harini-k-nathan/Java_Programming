package basicweb;

import java.lang.System;
import java.util.Scanner;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int i;
		int oddcount = 0;
		int evencount = 0;
		
		/*
		 * System.out.println("Enter num1"); int a = scan.nextInt();
		 * 
		 * System.out.println("Enter num2"); int b = scan.nextInt();
		 * 
		 * for (i=a; i<=b; i=i+1 ) {
		 * 
		 * System.out.println(i);
		 * 
		 * }
		 */
		
//print even numbers
		
		/*
		 * for (i=1; i<=10; i=i+1) {
		 * 
		 * if(i%2 == 0) {
		 * 
		 * System.out.println(i); }
		 * 
		 * 
		 * }
		 */
	
// print the count of odd numbers from 1 to 10	
		
		/*
		 * for (i=1; i<=10; i=i+1) {
		 * 
		 * if(i%2 == 0) {
		 * 
		 * 
		 * }
		 * 
		 * else {
		 * 
		 * oddcount = oddcount+1; //System.out.println(oddcount); }
		 * 
		 * 
		 * }
		 * 
		 * 
		 * 
		 * System.out.println(oddcount);
		 */
		// if odd count is printed inside for loop it will print all the count instead of total count
		//so it is printed outside for loop
		//if odd count is initialized inside for loop, it will take odd count value as zero all the time.

		
		// Print even numbers from 1 to 20
		
		/*
		 * for (i=1; i<=20; i = i+1) {
		 * 
		 * if(i%2 == 0) { evencount = evencount +1;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * 
		 * System.out.println(evencount);
		 */
		
		
		//Print number divisible by both 3 and 5, range 1 to 100
		
		
		for (i=1; i<=100; i=i+1 ) {
			
			if(i%3 ==0 && i%5==0) {
				
				System.out.println(i);
			}
		}
		
		
}
	
	
}