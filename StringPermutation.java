import java.util.Scanner;

public class StringPermutation
{
     static int fact(int n)
     {
         int val=1;
         for(int i=2;i<=n;i++)
         {
             val*=i;
         }
         return val;
     }
    
    
     static void permutationStrings(String str)
     {
         
         for(int i=0;i<fact(str.length());i++)
         {
             StringBuilder s=new StringBuilder(str);
             int temp=i;
             int q=0;
             int r=0;
             for(int j=str.length();j>=1;j--)
             {
                 r=temp % j;
                 q=temp / j;
                
               System.out.print(s.charAt(r));
               s.deleteCharAt(r);
               temp=q;
             }
             System.out.println();
         }
     }
    
	public static void main(String[] args) 
	{
	    permutationStrings("ABCD");
	}
}
