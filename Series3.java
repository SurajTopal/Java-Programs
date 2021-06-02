/**
  Consider the below series :

0, 0, 2, 1, 4, 2, 6, 3, 8, 4, 10, 5, 12, 6, 14, 7, 16, 8

This series is a mixture of 2 series all the odd terms in this series form even numbers in ascending order and 
every even terms is derived from the previous  term using the formula (x/2)

Write a program to find the nth term in this series.


*/

import java.util.Scanner;
public class Series3
{
	public static void main(String[] args)
	{
	    
	  Scanner scan=new Scanner(System.in);    
	    long no=scan.nextLong();

	    if(no%2==0)
	    {
	        System.out.println((no/2)-1);
	    }
	    else
	    {
	        System.out.println((no/2)*2);
	    }
	}
}
