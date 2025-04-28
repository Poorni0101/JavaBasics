package day2;

import java.util.Arrays;

public class sortnum {
	static void swap(int[] s)
	{
	int l = s.length;
	int temp = 0;
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
		int s[] = {53,23,62};
		String m[] = {"e","i","o","u","a"};
		for(int i = 0; i<s.length; i++)
		{
			System.out.println(+s[i]);
		}
		swap(s);
		System.out.println("The acending order of the numbers is:");
		for(int i = 0; i<s.length; i++)
		{
			System.out.println(+s[i]);
		}
		System.out.println("String array before sorting: "+Arrays.toString(m));
		Arrays.sort(m);
		System.out.println("Ascending order of string array is: "+Arrays.toString(m));
	}
		
	}
	
			
		
		