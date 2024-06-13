package basicweb;

import java.lang.System;
import java.util.Scanner;

public class WhileLoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int a =0;
		do {

			System.out.println("Enter the vale for a");
			 a = scan.nextInt();
			
		}while(a>10);
	}

}