/**
Consider the below series:
1, 2, 1, 3, 2, 5, 3, 7, 5, 11, 8, 13, 13, 17…..
This series is a mixture of 2 series fail the odd terms in 
this series form a Fibonacci series and all the even terms
 are the prime numbers in ascending order
Write a program to find the Nth term in this series . The value N in a positive integer that should be read from mm. 
The Nth term that is calculated by the program should be written to STDOUT 
Otherthan the value of Nth term , no other characters / string or message should be 
written to STDOUT. For example, when N:14, the 14th term in the series is 17 So
 only the value 17 should be printed to STDOUT
*/


import java.util.Scanner;
public class Series4
{
	void fibonacii(int n)
	{
		int a=0,b=1,next;
		for(int i=1;i<=n;i++)
		{
			next=a+b;
			a=b;
			b=next;
		}
		System.out.println(a);
	}
	
	void prime(int n)
	{
		int count=0;
		int flag=0;
		if(n==1)
			System.out.println("2");
		else
		{
		   	for(int i=2;i<99999;i++)
			{
				flag=0;
				for(int j=2;j<=(int)(Math.pow((double)i,0.5));j++)
				{
					if(i%j==0)
					{
						flag=1;
						System.out.println("I : "+i);
						break;
					}
				}
				
				if(flag==0)
				{
					if(++count==n)
					{
						System.out.println(i);
						break;
					}
				}
				
			}
		}
	}
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
	    Series4 obj=new Series4();
		int no=scan.nextInt();
	    if(no%2!=0)
	    {
	       obj.fibonacii((no/2)+1);
	    }
	    else
	    {
	     obj.prime(no/2);    
	    }
	}
}