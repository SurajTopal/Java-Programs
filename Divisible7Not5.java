//Write a Java program that prints all the numbers that are divisible by 7 but notby 5 
//between two numbers n1 and n2. Read n1 and n2 from keyboard from theuser.

import java.util.Scanner;
   class Divisible7Not5
  {
	  
	 private int n1;
	 private int n2;
    
     Divisible7Not5(int n1,int n2)
	 {
		 this.n1=n1;
		 this.n2=n2;
	 }	 
	 
	 void display()
     {
		 for(int i=n1;i<=n2;i++)
		 {
			 if(i%7==0 && i%5!=0)
			 {
				 System.out.println("No is : "+i);
			 }
		 }
	 } 
    public static void main(String args[])
	{
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter two number : -> ");
	  int n1=scan.nextInt();
	  int n2=scan.nextInt();
	  Divisible7Not5 obj=new Divisible7Not5(n1,n2);
	  System.out.println("Print all number between "+n1+" to "+n2);
	  obj.display();
	}
  }