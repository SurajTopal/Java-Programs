/**
Find the 15th term of the series?

0,0,7,6,14,12,21,18, 28

Explanation : In this series the odd term is increment of 7 {0, 7, 14, 21, 28, 35 – – – – – – }

 And even term is a increment of 6 {0, 6, 12, 18, 24, 30 – – – – – – }


*/
import java.util.Scanner;
public class Series1
{
	public static void main(String[] args)
	{
	    
	  Scanner scan=new Scanner(System.in);    
	    int no=scan.nextInt();
	    
	    if(no%2==0)
	    {
	        System.out.println(6*(no/2-1));
	    }
	    else
	    {
	        System.out.println(7*(no/2));
	    }
	    
	}
}
