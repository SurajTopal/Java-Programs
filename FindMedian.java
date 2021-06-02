import java.util.Scanner;
    class FindMedian
	{
		static int median(int ...a)
		{
	       int temp[]=new int[a.length];
		   int left=0;
		   int right=a.length-1;
		   int k=a.length/2;
		   System.out.println(" Pivot : "+a[k]);
		   for(int i=0;i<a.length;i++)
		   {
			   if(i==k)
			   {
				   continue;
			   }
			   else if(a[k]<a[i])
			   {
				   temp[right]=a[i];
				   right--;
			   }
			   else
			   {
				   temp[left]=a[i];
				   left++;
			   }
		   }
		   temp[right]=a[k];
		   for(int i=0;i<a.length;i++)
		   {
			  System.out.print(" "+temp[i]); 
		   }
		    
		   
		   return 0;
		}
	  public static void main(String args[])
	  {
	     Scanner scan=new Scanner(System.in);
		 int n=scan.nextInt();
		 int a[]=new int[n];
		 for(int i=0;i<n;i++)
		 {
			 a[i]=scan.nextInt();
		 }
		 System.out.println("Result : "+median(a));
	  }
	}