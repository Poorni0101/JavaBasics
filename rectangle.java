package day2;

import java.util.Scanner;

public class rectangle {
public static void main(String[] args) 
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the width:");
	int w = s.nextInt();
	System.out.println("Enter the height:");
	int h = s.nextInt();
	s.close();
	
	int area = w*h;
	int perimeter = 2*(w+h);
	System.out.println("Area of rectangle is "+area);
	System.out.println("Perimeter of rectangle is "+perimeter);
}
}
