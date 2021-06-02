import java.util.Scanner;
class ArrayProgram
{
	static int length=0;
	
   static void insert(int a[],int index ,int data)
	{
		
	  if(length!=a.length)
	 { 		
		  if(a[index]==-1)
		  {
			  a[index]=data;
		  }
           else
           {
			   for(int j=length;j>index;j--)
			   {
				   a[length]
			   }
		   }			   
	 } 
	}
	
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
	System.out.println("Enter size of the array : ");
	int size=scan.nextInt();
	int a[]=new int[size];
	for(int i=0;i<size;i++)
	{
		a[i]=-1;
	}
	
	
	
  }
}