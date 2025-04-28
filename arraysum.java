package day2;

import java.util.Scanner;

public class arraysum {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int l = s.nextInt();
		int arr[] = new int[l];
		for(int i =0;i<l;i++)
		{
		System.out.println("Enter the number:");
		arr[i] = s.nextInt();
		
		}
		s.close();
		int sum = 0;
		int avg = 0;
		for(int i = 0; i<arr.length;i++)
				{
			
			 sum = sum + arr[i];
			 			
				}
		avg = sum/arr.length;
		System.out.println("Sum of the array is: "+sum);
		System.out.println("Average is: "+avg);
		
	
	}
		
		
	
}
