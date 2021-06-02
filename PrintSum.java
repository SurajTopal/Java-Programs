import java.util.Scanner;
class PrintSum
{
  public static void main(String args[])
  {
     Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the number : ");
	 int n=scan.nextInt();
	 if(n<0)
	    System.out.println("Please Enter Positive Number ....");
	 else
	    {
		  int i=1;
		  int sum=0;
		   while(i<=n)
		   {
		     sum+=i;
		     i++;
		   }
		   System.out.println("Sum : "+sum);
		}
  }
}