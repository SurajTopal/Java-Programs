import java.util.Scanner;
public class LeapYear
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Year : - \n");
		 int no=scan.nextInt();
		 if(no%4==0)
		 {
    		   if(no%100==0)
    		   {
        		     if(no%400==0)
        		     {
        		         System.out.println("Leap Year...");
        		     }
        		     else
        		     {
        		     System.out.println("Not Leap Year...");
        		     }
        	   } 
    		   else
    		   {
    		       System.out.println("Leap Year...");
    		   }
		 }
		 else
		 {
		     System.out.println("Not Leap year...");
		 }
	}
}