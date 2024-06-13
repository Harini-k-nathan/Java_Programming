package basicweb;


import java.lang.System;
import java.util.Scanner;


public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[5];
		
		num[0] = scan.nextInt();
		num[1] = scan.nextInt();
		num[2] = scan.nextInt();
		num[3] = scan.nextInt();
		num[4] = scan.nextInt();

		
		int total = num[0] + num[1] + num[2] + num[3] + num[4];
		
		System.out.println(total);

	}

}
