package day2;

import java.util.Scanner;

public class add {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the first number: ");
	int a = s.nextInt();
	System.out.println("Enter the second number: ");
	int b = s.nextInt();
	System.out.println("Addition "+(a+b));
	 System.out.println("Subtraction "+(a-b));
	 System.out.println("Multiplication = "+(a*b));
	 System.out.println("Division = "+(a/b));
	 System.out.println("Reminder = "+(a%b));
	 s.close();
	 
	 
}
	

}
