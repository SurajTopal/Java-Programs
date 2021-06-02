import java.util.Scanner;
 class PrimeNumber
{
  static boolean checkPrimeNumber(int number)
  {
	  int count=0;
	  if(number ==0 || number == 1)
	  {
		  return false;
	  }
	  else if(number ==2)
	  {
		  return true;
	  }
	  else
	  {
		  for(int i=2;i<number/2;i++)
		  {
			  if(number%i==0)
				  count++;
		  }
	  }
	  System.out.println("count : "+count	);
	  if(count>=1)
	  {
		return false;
	  }
	  else
	  {
		  return true;
	  }
  }
  public static void main(String args[])
  {
     Scanner scan=new Scanner(System.in);
	 System.out.println("\nEnter the Number : - \n");
	 int no=scan.nextInt();
     if(no>=0)
     {
		 boolean result=checkPrimeNumber(no);
		 if(result==true)
			  System.out.println("Prime Number..");
		  else
			  System.out.println("Not Prime Number..");
	 }	
     else
     {
		 System.out.println("Please enter the positive number....");
	 }		 
 
  }
}