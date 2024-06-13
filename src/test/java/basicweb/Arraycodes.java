package basicweb;

import java.lang.System;
import java.util.Scanner;

public class Arraycodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Get input for size of an array
		
		Scanner scan = new Scanner(System.in);
		
		/*
		 * System.out.println("Enter the size of the array"); int input =
		 * scan.nextInt(); int[] size = new int[input];
		 * 
		 * for(int i=0; i<=input-1; i=i+1) {
		 * 
		 * size[i] = scan.nextInt(); }
		 */
	
		//nested forloop print *** three times
		
		for (int i=1; i<=3; i=i+1) {
			
			for (int j=1; j<=i; j=j+1) {
				
				System.out.print("*");
				
			}
			 System.out.println();
			
			}
		     
		
		
		
		
	}

}
