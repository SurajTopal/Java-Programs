/**
We want to estimate the cost of painting a property. Interior wall painting cost is Rs.18 per sq.ft. and exterior wall painting cost is Rs.12 per sq.ft.

Take input as
1. Number of Interior walls
2. Number of Exterior walls
3. Surface Area of each Interior 4. Wall in units of square feet
Surface Area of each Exterior Wall in units of square feet

If a user enters zero  as the number of walls then skip Surface area values as User may don’t
  want to paint that wall.

Calculate and display the total cost of painting the property


*/




import java.util.Scanner;
class PropertyPainting
{
     public static void main(String arg[])
     {
       Scanner scan=new Scanner(System.in);
       int inWallsize=scan.nextInt();
       int exWallsize=scan.nextInt();
       double sumin=0,sumex=0;
      if(inWallsize<0 || exWallsize<0)
      {
          System.out.println("INVALID INPUT");
      }
      else if(inWallsize==0 && exWallsize==0)
      {
          System.out.println("Total estimated Cost : 0.0 INR");
      }
      else
      {
       for(int i=1;i<=inWallsize;i++)
       {
           double inWall=scan.nextDouble();
           sumin=sumin+inWall;
       }
       
       sumin=sumin*18;
       
       for(int i=1;i<=exWallsize;i++)
       {
           double exWall=scan.nextDouble();
           sumex=sumex+exWall;
       }
       
       sumex=sumex*12;
	   
	   double result=sumex+sumin;
       System.out.printf("Total estimated Cost : %.1f INR",result);
      }      
    }
}
