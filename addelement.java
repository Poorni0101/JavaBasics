package day2;

import java.util.Arrays;
import java.util.Scanner;

public class addelement {

	public static void main(String[] args) {
		int a[]= {1,2,7,4};
		int b[] = new int[5];
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int v = s.nextInt();
		
		s.close();
			
		int i,j;
		for( i=0,j=0; i<a.length;i++)
		{
			b[j] = a[i];
					j++;			}
		
		System.out.println("before"+Arrays.toString(a));
		
		b[4] = v;
		System.out.println("after"+Arrays.toString(b));
	}
}
