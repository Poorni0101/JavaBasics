package day2;

import java.util.Scanner;

public class multiplication {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		int i;
		for(i=1;i<=10;i++)
		{
			int m;
			m = num*i;
			System.out.println(i+"*"+num+"="+m);
		}
	}

}
