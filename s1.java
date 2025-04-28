package day2;

import java.util.Scanner;

public class s1 {
	public static void main(String[] args) {
		System.out.println("Enter number 1 to 7: ");
		Scanner day = new Scanner(System.in);
		int d = day.nextInt();
				day.close();
						
		switch(d)
		{
		case 1:
			System.out.println("Sunday");
         break;
		case 2:
			System.out.println("Monday");
         break;
		case 3:
			System.out.println("Tuesday");
         break;
		case 4:
			System.out.println("Wednesday");
         break;
		case 5:
			System.out.println("Thursday");
         break;
		case 6:
			System.out.println("Friday");
         break;
		case 7:
			System.out.println("Saturday");
         break;
         default:
        	 System.out.println("not valid entry");
		}
	}

}
