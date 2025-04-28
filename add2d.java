package day2;

public class add2d {

	public static void main(String[] args) {
		int[][] twod= {{1,2,3},{4,5,6},{7,8,9}};
		int a =0;
		int row = 0;int col = 0; 
		int row1 = 1; int col1 = 1;
		int row2 = 2; int col2 = 2;
		for(int i=0; i<3;i++)
		{
			for(int j = 0; j<3;j++)
			{
             

				System.out.print(twod[i][j]);
			}
				
					System.out.println();
		}
		System.out.println(twod[row][col]);
		System.out.println(twod[row1][col1]);
		System.out.println(twod[row2][col2]);
		a = a+twod[row][col]+twod[row1][col1]+twod[row2][col2];
		System.out.println("Sum of diagnoal : "+a);
			}
		
	}

