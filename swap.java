package day2;

import java.util.Scanner;

public class swap {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of A: ");
		int a = s.nextInt();
		System.out.println("Enter the valuce of B : ");
		int b = s.nextInt();
		System.out.println("The entered numbers are "+a+" and " +b );
		
		//int c = a;
		// a = b;
		//b = c;
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("The swapped numbers are "+a+" and " +b );
	s.close();
	}
	
}
