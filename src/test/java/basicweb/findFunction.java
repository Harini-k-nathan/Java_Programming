package basicweb;

import java.lang.System;
import java.util.Scanner;

public class findFunction {
	
	void evenorodd(int a)
	{
		
		if(a%2 == 0) {
			System.out.println("a is an even number");
		}
		
		else {
			System.out.println("a is an odd number");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		
		findFunction obj1 = new findFunction();
		obj1.evenorodd(a);

	}

}
