package basicweb;

import java.lang.System;
import java.util.Scanner;

public class Code3demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int d = a*b*c;
		int e = a+b+c;
		
		int answer = d/e;
		
		System.out.println(answer);
		
		
	}

}
