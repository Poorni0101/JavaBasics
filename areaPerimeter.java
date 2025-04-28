package day2;

import java.util.Scanner;

public class areaPerimeter {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius:");
		float radius = s.nextFloat();
		s.close();
		
		double peri = 3.14*2*radius;
		double area = 3.14*radius*radius;
				System.out.println("Perimeter of a circle is :"+peri);
       System.out.println("Area of a circle is :"+area);
		
	}

}
