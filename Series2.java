/**
    Consider the following series: 1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243, 64, 729, 128, 2187 …
This series is a mixture of 2 series – all the odd terms in this series form a geometric series and all the even terms form yet another geometric series.
 Write a program to find the Nth term in the series.

*/

import java.util.Scanner;
public class Series2
{
	public static void main(String[] args)
	{
	    
	  Scanner scan=new Scanner(System.in);    
	    long no=scan.nextLong();
	    long power=0;
	    long result=1;
	    if(no%2==0)
	    {
	         power=(no/2)-1;
	         while(power>0)
	         {
	             result=result*3;
	             power--;
	         }
	    }
	    else
	    {
	        power=(no/2);
	        while(power>0)
	        {
	            result=result*2;
	            power--;
	        }
	    }
	    System.out.println("Result : "+result);
	    
	}
}
