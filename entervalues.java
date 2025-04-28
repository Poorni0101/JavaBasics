package day2;

import java.util.Scanner;

public class entervalues {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
					
		System.out.println("Enter a whole number: ");
		int a = s.nextInt();
		System.out.println("Enter a decimal(double) number: ");
		double b = s.nextDouble();
		System.out.println("Enter a decimal(float) number: ");
		float c = s.nextFloat();
		System.out.println("Enter true or false only: ");
		boolean d = s.nextBoolean();
		System.out.println("The whole number is:"+a);
		System.out.println("The decimal(double) number is:"+b);
		System.out.println("The decimal(float) number is:"+c);
		System.out.println("The Entered boolean is:"+d);
		s.close();
		
		double sum = a+b+c;
		double sub = a-b-c;
		double avg = sum/3;
		System.out.println("The Addition  "+sum);
		System.out.println("The subtraction  "+sub);
		System.out.println("The Average  "+avg);
	}

}
