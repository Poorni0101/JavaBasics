package day2;

import java.util.Scanner;

public class upperhalves {
	public static void main(String[] args) {
		int a[][] = new int[3][3];
		Scanner s = new Scanner(System.in);
		
		for(int i = 0;i<3;i++)
		{
			for( int j=0; j<3;j++)
			{
				System.out.println("Enter number for index " + i +"and "+j+"  : ");
				a[i][j ] = s.nextInt();
						}
		
		}
		System.out.println("enter array is: ");
		for(int i = 0;i<3;i++)
		{
		 for(int j=0;j<3;j++)
		 {
			 
			System.out.print(a[i][j]+" ");
		 }
		 System.out.println();
		}
		//upper halves
		System.out.println("Upper half: ");
		for(int i = 0;i<3;i++)
		{
		 for(int j=0;j<3;j++)
		 {
			 if(i<=j)
			 {
			System.out.print(a[i][j]+" ");
			 }
			 else
			 {System.out.print("  ");}
		 }
		 System.out.println();
		}
		//lower halves
				System.out.println("Lower half: ");
				for(int i = 0;i<3;i++)
				{
				 for(int j=0;j<3;j++)
				 {
					 if(i>=j)
					 {
					System.out.print(a[i][j]+" ");
					 }
					 else
					 {System.out.print("  ");}
				 }
				 System.out.println();
				}
		s.close();
		
		
	}

}
