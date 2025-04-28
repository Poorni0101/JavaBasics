package day2;

public class loopsdemp {
	public static void main(String[] args) {
		System.out.println("For loop:");
		for(int i = 1; i<=5; i++)
		{
			System.out.println(i);
		}
		
		int j=6;
		
		System.out.println("do..while loop:");
        do
        {
         j--;
        System.out.println(j);
	    }
        while(j>=2 );
        
        int k=1;
        
        int sum=0;
        System.out.println("while loop:");
        while(k<=5)
        {
        	sum = sum+k;
        	System.out.println(sum);
        	k++;
        	
        }

}
}