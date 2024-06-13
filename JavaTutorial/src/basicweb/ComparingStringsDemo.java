package basicweb;

import java.lang.System;
import java.util.Scanner;

import java.util.Scanner;

public class ComparingStringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String RCB = scan.nextLine();
		String Meghana = scan.nextLine();
		
		//String RCB = new String("Win");
		//String RCB = "Win";
		
		if(RCB.equals("Win")) {
			
			System.out.println("Ee saala cup namde");
		}
		else {
			
			System.out.println("Cup Nahi");
		}
		
		
		if(Meghana.equals("Dead")) {
			
			System.out.println("Surya meets ramya");
		}
		
		else {
			
			System.out.println("Surya weds Mehgana");
		}
		
	}

}