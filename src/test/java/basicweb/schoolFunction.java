package basicweb;

import java.lang.System;
import java.util.Scanner;


public class schoolFunction {
	
	String passorfail(int marks)
	{
		if(marks >=35) {
			
			return "Pass";
		}
		else
		{
			return "Fail";
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int marks = scan.nextInt();
		
		schoolFunction obj1 = new schoolFunction();
		
		String result = obj1.passorfail(marks);
		
		System.out.println(result);
		
		
	}

}
