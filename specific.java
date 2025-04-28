package day2;

import java.util.Scanner;

public class specific {

	public static void main(String[] args) {
			
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a length of an array:");
		int v = s.nextInt();
		int arr[] = new int[v];
		for(int i=0;i<v;i++)
		{
			System.out.println("Enter a number for the index "+i +" :");
			arr[i] = s.nextInt();
		}
		System.out.println("Enter an element for which you need the index:");
		int f = s.nextInt();
		int j = -1;
		for(int i=0; i<v;i++)
		{
			if(arr[i]==f)
			{
				j = arr[i];
				System.out.println("The value "+f+" is present in the index "+i);
			}
		}
		if(j==-1)
		{
			System.out.println("THe value "+f+" is not present in the array");
		}
		
		s.close();
	}
}
