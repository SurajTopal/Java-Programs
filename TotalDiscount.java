import java.util.Scanner;
  class TotalDiscount
  {
     public static void main(String args[])
	 {
	    Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int check=0;
		int sumeven=0,sumodd=0;
		while(n!=0)
		{
			check=n%10;
			if(check % 2 ==0 )
				sumeven=sumeven+check;
			else
                sumodd=sumodd+check;

            n=n/10;			
		}
		
		int product=sumeven+sumodd;
		System.out.println("SumEven : "+sumeven);
		System.out.println("SumOdd  : "+sumodd);
		System.out.println("Total Discount : "+sumeven*sumodd);
	 }
  }