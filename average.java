package day2;

import java.util.Scanner;

public class average {
	float a;
	float b;
	float c;
	
 public  average(float a, float b, float c) {
	 this.a = a;
	 this.b = b;
	 this.c = c;
 }
 public static void calculate(float a, float b, float c)
 {
	 float d = (a+b+c)/3;
	 System.out.println("THe average of 3 numbers is : "+d);
	 
 }
 public static void main(String[] args) {
	 System.out.println("Enter the first number:");
	Scanner s = new Scanner(System.in);
	float a = s.nextFloat();
	System.out.println("Enter the second number:");
	
	float b = s.nextFloat();
	
	System.out.println("Enter the third number:");
	float c = s.nextFloat();
	
	calculate(a,b,c);
	s.close();
 }

}

