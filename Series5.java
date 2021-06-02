
// 1 1 2 3 5 8 13 ....
import java.util.Scanner;
class Series5
{
   public static void main(String args[])
   {
      Scanner scan=new Scanner(System.in);
      int no=scan.nextInt();
	  int x=0,y=1,next;
	  for(int i=1;i<=no;i++)
	  {
		  next=x+y;
		  x=y;
		  y=next;
		  System.out.println(x);
	  }  
   }
}