import java.util.Scanner;
class JaggedArray
{
  public static void main(String args[])
  {
	  Scanner scan=new Scanner(System.in);
       int a[][]=new int[3][];
	   a[0]=new int[2];
	   a[1]=new int[3];
	   a[2]=new int[2];
	      for(int i=0;i<a.length;i++)
		  {
			  for(int j=0;j<a[i].length;j++)
			  {
				 a[i][j]=scan.nextInt();
			  }
		  }
	   
	   System.out.println("Printing Array Value : \n\n");
	      for(int i=0;i<a.length;i++)
		  {
			  for(int j=0;j<a[i].length;j++)
			  {
				  System.out.print("  "+a[i][j]);
			  }
			  System.out.println();
		  }
  }
}