package day2;

public class pattern6 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i<=n; i++)
		{
			for (int j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++)
			{
				System.out.print("*");
				if(k!=i) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i = n-1; i>=1; i--)
		{
			for (int j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			for(int k= 1; k<=i;k++)
			{
				System.out.print("*");
				if(k!=i) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
