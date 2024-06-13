package basicweb;

import java.lang.System;
import java.util.Scanner;

public class TernaryOperatorDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		
		
		  int a = scan.nextInt(); 
		  int b = scan.nextInt();
		  
		  
		  String result = a>b? "Int a is greater thant b" : "Int b is greater than a";
		  
		  System.out.println(result);
		 

		// For loop

		
		  int i;
		  
		  for (i = 1; i <= 2; i = i + 1) {
		  
		  System.out.println(i); }
		 

		  for (i=5; i>=1; i = i - 1) {
			  
			  System.out.println(i);
		  }
		  
		  
	}

}