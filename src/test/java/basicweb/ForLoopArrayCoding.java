package basicweb;

import java.lang.System;
import java.util.Scanner;

public class ForLoopArrayCoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		
		//get user input for 5 integers using array and for loop
		
		/*
		 * int[] marks = new int[5];
		 * 
		 * for (int i=0; i<5; i=i+1) {
		 * 
		 * marks[i] = scan.nextInt(); }
		 * 
		 * for (int i=0; i<5; i=i+ 1) {
		 * 
		 * System.out.println(marks[i]);
		 * 
		 * }
		 */
		
		
		
		
		//print numbers in an array using for lopp
		
		/*
		 * int[] marks = new int[] {23, 24, 25, 26, 27, 28};
		 * 
		 * for (int i=0; i<=5; i=i+1) {
		 * 
		 * System.out.println(marks[i]);
		 * 
		 * }
		 */
		
		
		
		// print 2 table
		/*
		 * for (int i=1; i<=10; i=i+1) { System.out.println(i+"x2="+ i*2);
		 * 
		 * }
		 */
		
		
		// print any table using user input given
		
		int table = scan.nextInt();
		
		for(int i=1; i<=10; i=i+1) {
			
			System.out.println(i+"x7="+i*table);
		}
		
		

	}

}
