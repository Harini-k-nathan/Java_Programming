package basicweb;

import java.lang.System;
import java.util.Scanner;


public class code2demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		String name = scan.nextLine();
		int age = scan.nextInt();
		scan.nextLine();
		String Location = scan.nextLine();
		
		System.out.println("My name is " + name);
		System.out.println("My age is " + age);
		System.out.println("My address is " + Location);
		
		
		
	}

}
