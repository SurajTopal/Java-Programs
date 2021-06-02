//Write a Java program that reads one integer number(say, n) and
// prints thefollowing aspects of this number: if it is prime, 
// if it is odd or even number, if itis a +ve or -ve number, 
//sum of all natural numbers fro 1 till n.

import java.util.Scanner;
import java.lang.Math;
    class Program1
	{
	   int no;
	   
	   Program1(int no)
	   {
		   this.no=no;
	   }
	   boolean positiveNegative()
	   {
		  if(no>0)
             return true;
           else
             return false;			   
	   }
		
	   boolean evenOdd()
       {
		   if(no%2==0)
			    return true;
			else 
				return false;
	   }	   
	   	
	   int sum()
       {
		   int sum=0;
		   if(no>0)
		   {	   
		    for(int i=1;i<=no;i++)
			  sum=sum+i;
		   }
		  return sum;
	   }	   
	   
	   boolean primeNotPrime()
	   {
		   if(no==1)
			   return false;
		   if(no==2)
			   return true;
		   
		 
		   
		   for(int i=3;i<=no/2;i++)
		   {
			   if(no%i==0)
			   {            
			      return false;   		  
     			  }   			   
		   }
		   
		   return true;
	   }
	   
	   public static void main(String args[])
	   {
	      Scanner scan=new Scanner(System.in);
		  System.out.println("Enter the Number : ");
		  int n=scan.nextInt();
		  Program1 obj=new Program1(n);
		  
		  System.out.println("Given no is odd or Even :");
		  if(obj.evenOdd())
			  System.out.println("\nNo is Even : "+n);
		  else 
			  System.out.println("\nNo is Odd : "+n);
		  
		  System.out.println("\n\nGiven no is positive or negative :");
		  if(obj.positiveNegative())
		       System.out.println("\nNo. is Positive : "+n);
		   else
			   System.out.println("\nNo. is Negative : "+n);
		  
	      System.out.println("\n\nPrint sum of natural no. till n is : "+obj.sum());
		  
	   
	     System.out.println("\n\nN is Prime or Not Prime : ");
		
		if(obj.primeNotPrime())
		     System.out.println("\nNo. is Prime ..   : "+n);
		   else 
			 System.out.println("\nNo. is not Prime.. : "+n);
	   }
	}