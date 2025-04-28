package day2;

import java.util.Scanner;

public class swap {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A:");
		int a = scan.nextInt();
		System.out.println("Enter B:");
		int b = scan.nextInt();
		scan.close();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping A is "+a);
		System.out.println("After swapping B is "+b);
	}

}
