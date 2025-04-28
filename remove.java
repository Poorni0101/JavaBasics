package day2;

import java.util.Arrays;
import java.util.Scanner;

public class remove {

	public static void main(String[] args) {
		int a[]= {1,2,7,4};
		int b[] = new int[3];
		System.out.println("Select a number to be removed from : 1,2,7,4");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int v = s.nextInt();
		s.close();
		int i,j;
		for( i=0,j=0; i<a.length;i++)
		{
			if(a[i]!=v)
			{
				b[j]=a[i];
				j++;
			}
		}
		
		System.out.println("before"+Arrays.toString(a));
		System.out.println("after"+Arrays.toString(b));	
	}
}
