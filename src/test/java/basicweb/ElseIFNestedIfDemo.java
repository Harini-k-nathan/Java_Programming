package basicweb;

import java.lang.System;
import java.util.Scanner;

public class ElseIFNestedIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		//int Score = scan.nextInt();
		
//		if(Score<50) {
//			
//			System.out.println("you need to improve");
//			
//		}
//		
//		else if (Score>=50 && Score<=70) {
//			
//			
//			System.out.println("Good job!");
//		}
//		
//		else if(Score>70) {
//			System.out.println("Excellent Performance");
//		}

//		int mat = scan.nextInt();
//		int sci = scan.nextInt();
//		int sco = scan.nextInt();
//		int eng = scan.nextInt();
//		int tam = scan.nextInt();
//		
//		int total = mat+sci+sco+eng+tam;
//		
//		int average = total/5;
//		
//		if (average<35) {
//			System.out.println("Additional class required");
//		}
//		
//		else {
//			System.out.println("You are good to go");
//		}
//		
		
//		String colour = scan.nextLine();
//		
//		if(colour.equals("red")) {
//			
//			System.out.println("Stop");
//		}
//		
//		else if(colour.equals("yellow")) {
//			
//			System.out.println("Get Ready");
//			
//		}
//		else if(colour.equals("Green")) {
//			
//			System.out.println("Go");
//		}
//	}
		
		
		int salary = scan.nextInt();
		int age = scan.nextInt();
		
		
		if(salary>=20000 || age<=25 ) {
			
			System.out.println("You are eligible for loan");
			
			int requiredLoan = scan.nextInt();
			
			if (requiredLoan<50000) {
				
				System.out.println("Loan available ");
			}
				
			else {
			System.out.println("Maximum Loan amount is 50000");
				
			}
		}
		
		else  {
			System.out.println("Not Eligible for loan");
		}
		
		
		
		
		
	}
	
	
}
		


