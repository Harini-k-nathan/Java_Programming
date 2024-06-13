package basicweb;

import java.lang.System;
import java.util.Scanner;

public class code4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		String name = scan.nextLine();
		double marks = scan.nextDouble();
		scan.nextLine();
		String department = scan.nextLine();
		
		System.out.println("My name is " + name);
		
		System.out.println("My mark is " + marks/10);
		
		System.out.println("My department is " + department);
		
		
	}

}