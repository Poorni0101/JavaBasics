package day2;

import java.util.Scanner;

public class ifelse {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		if(num>10)
	    System.out.println("The number is greater than 10");
		else
			System.out.println("The number is lesser than 10");
		if(num==5)
			System.out.println("you have entered number 5!");
;	}

}
