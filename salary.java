package day2;

import java.util.Scanner;

public class salary {
public static void main(String[] args) {
	
	Scanner os = new Scanner(System.in);
	System.out.println("Enter the old salary:");
	double o = os.nextDouble();
	
	System.out.println("Enter the years of experience: ");
		int e = os.nextInt();
		System.out.println("Enter true if you have rewards else enter false:");
		boolean r = os.nextBoolean();
		int rew = 0;
		if(r==true) {
		System.out.println("How many rewards:");
				 rew = os.nextInt();
				}
		
		
	os.close();
  // System.out.println(o+"\t"+e);
	
        if(e<3) {
        	if(r==true)
    		{
    			double f;
    			f=0;
    			f = 1000*rew;
    			f=f+o;
    					if (f>=1) {
    				    System.out.println("Reward is "+f);	
    			        }}
		System.out.println("No revision");}
		
        else if(e>=3 && e<=5)
        {
        	double n;
        	double i;
        	i = (10.0/100.0)*o;
        	        	n = o+i;
        		if(r==true)
        		{
        			double f;
        			f=0;
        			f = 1000*rew;
        			f=f+n;
        					if (f>=1) {
        				    System.out.println("Revised salary is "+f);	
        			        }
        		}
        		if(r==false)
        		System.out.println("Revised salary is "+n);
        }
        else if(e>=6 && e<=9)
        {
        	double n;
        	n = o+15.0/100.0*o;
        	if(r==true)
    		{
    			double f;
    			f=0;
    			f = 1000*rew;
    			f=f+n;
    					if (f>=1) {
    				    System.out.println("Revised salary is "+f);	
    			        }
    					
    		}
    		if(r==false)
        	System.out.println("Revised salary is "+n);
        }
        else if(e>=10 && e<=20)
        {
        	double n;
        	n = o+20.0/100.0*o;
        	if(r==true)
    		{
    			double f;
    			f=0;
    			f = 1000*rew;
    			f=f+n;
    					if (f>=1) {
    				    System.out.println("Revised salary is "+f);	
    			        }
    					
    		}
    		if(r==false)
        	System.out.println("Revised salary is "+n);
        }
        else if(e>=21)
        {
        	double n;
        	n = o+10.0/100.0*o;
        	if(r==true)
    		{
    			double f;
    			f=0;
    			f = 1000*rew;
    			f=f+n;
    					if (f>=1) {
    				    System.out.println("Revised salary is "+f);	
    			        }
    					
    		}
    		if(r==false)
        	System.out.println("Revised salary is "+n);
        }
    	
}
}
