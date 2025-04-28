package day2;

import java.util.Scanner;

public class numberavg {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = s.nextInt();
		System.out.println("Enter a number :");
		int b = s.nextInt();
		System.out.println("Enter a number :");
		int c = s.nextInt();
		s.close();
		
		int sum = a+b+c;
		System.out.println("sum of 3 numbers is :"+sum);
		int avg = (a+b+c)/3;
		System.out.println("Average of 3 numbers is :"+avg);
	}

}
