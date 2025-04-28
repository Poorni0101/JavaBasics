package day2;

import java.util.Scanner;

public class biggestof3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		float num1 = scan.nextFloat();
		System.out.println("Enter second number:");
		float num2 = scan.nextFloat();
		System.out.println("Enter third number:");
		float num3 = scan.nextFloat();
		scan.close();
		float large = calling(num1, num2, num3);
		
		System.out.println(large +" is biggest");
	}



public static float calling(float num1, float num2, float num3)
{
	float large = 0;
	if(num1>num2)
	{
		if(num1>num3)
			large = num1;
	}
	else if(num2>num3)
		large = num2;
	else
		large = num3;
	return large;
	}
}