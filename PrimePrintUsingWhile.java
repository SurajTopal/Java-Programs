import java.util.Scanner;
class PrimePrintUsingWhile
{
	private int n1;
	private int n2;
	PrimePrintUsingWhile(int n1,int n2)
	{
		this.n1=n1;
		this.n2=n2;
	}
	
	void printPrimeNumber()
	{
		//for(int i=n1;i<=n2;i++){
		int i=n1;	
		while(i<=n2)	
		{ 	
			int count=0;	
         	if(i==1 ||i==4)
			 {
				 count++;
			 }
		    else
			{
			//   for(int j=3;j<=i/2;j++) {
				int j=3;
                while(j<=i/2)		        
				{
				   if(i%j==0)
				   {       
					   count++;		   
				   }
				   j++;
			     }
			}   			
			 if(count==0)
				 System.out.print(" "+i);
			 i++;
		}
	}
   public static void main(String args[])
   {
     Scanner scan=new Scanner(System.in);
	 System.out.println("Enter two number : ");
	 int n1=scan.nextInt();
	 int n2=scan.nextInt();
	 PrimePrintUsingWhile obj=new PrimePrintUsingWhile(n1,n2);
	 
	 System.out.println("Print all Prime no . -------\n\n");
	 obj.printPrimeNumber();
   }
}