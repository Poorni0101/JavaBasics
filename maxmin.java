package day2;

import java.util.Arrays;
import java.util.Scanner;

public class maxmin {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int l = s.nextInt();
		int a[] = new int[l];
		for (int i = 0; i<l;i++)
		{
		System.out.println("Enter a number: ");
		a[i]= s.nextInt();
		}
		s.close();
		System.out.println("Array is "+Arrays.toString(a));
		int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
		for(int i = 0; i<a.length;i++)
		{
			if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
				}
		
		System.out.println("Maximum is "+max);
		System.out.println("Minimum is "+min);
		
			
		
	}
}
