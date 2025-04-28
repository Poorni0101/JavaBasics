package day2;

public class swapstring {
	static void swap(char[] s)
	{
	int l = s.length;
	char temp = 0;
	for(int i=0;i<l;i++)
	{
		for(int j=1;j<(l-i);j++)
		{
			if(s[j-1]>s[j])
			{
				temp = s[j-1];
				s[j-1]= s[j];
				s[j]= temp;
			}
		}
	}
	}
	public static void main(String[] args) {
		//String strArray[] = {"happy"};
		char s[] = {'d','c','y','o'};
		//char[] charArray = converStrArrayT0CharArray(strArray);
	//	System.out.println(charArray);
				
		for(int i = 0; i<s.length; i++)
		{
			System.out.print(s[i]+" ");
		}
		swap(s);
		System.out.println("The acending order of the numbers is:");
		for(int i = 0; i<s.length; i++)
		{
			System.out.print(s[i]+" ");
		}
		}
		
	}
	
			
		
		