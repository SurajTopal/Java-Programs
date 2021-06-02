import java.util.Scanner;
class PopulateArray
{
   public static void main(String args[])
   {
      Scanner scan=new Scanner(System.in);
	  System.out.println("Enter No. of Test cases : - \n");
	  int t=scan.nextInt();
	  for(int i=1;i<=t;i++)
	  {
		  int count=1;
		  int n=scan.nextInt();
          int ar[]=new int[n];     		
    	  int j=0,k=n-1;
		  if(n==1)
			  ar[0]=1;
		  if(n>1)
          {
					  for(int a=1;a<=n/2;a++)
					  {
						  ar[j++]=count++;
						  ar[k--]=count++;
					  }
									  if(n%2!=0)
										{  ar[n/2]=count;   }
		  }
		  System.out.println("\n\nPopulate Array: \n\n");
		  for(int a=0;a<n;a++)
		  {			  System.out.print(" "+ar[a]);           }
	  }
   }
}