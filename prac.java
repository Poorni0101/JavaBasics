package day2;

public class prac {
	
	static void swapstring(int[] c)
	{
		int l = c.length;
		int temp = 0;
		for(int i=0;i<l;i++)
		{
			for(int j=1;j<(l-i);j++)
			{
				if(c[j-1]>c[j])
				{
					temp = c[j-1];
					c[j-1] = c[j];
					c[j] = temp;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		int c[] = {3,2,1};
		swapstring(c);
		for (int i =0; i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
	}
	

}
