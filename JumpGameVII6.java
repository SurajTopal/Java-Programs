import java.util.Scanner;
public class JumpGameVII6
{
    static boolean canReach(String s , int min , int max)
    {
	  int i=0;
        while(i<s.length())
		{
		
		    if(i==s.length()-1)
			    return true;
			
		
            if( min+i <= s.length()- 1 && s.charAt(min+i)=='0')
            {
                   i+=min;;
            }
            else if( max+i <= s.length()- 1 &&  s.charAt(max+i)=='0' )
            {
                i+=max;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) 
	{
	    Scanner scan=new Scanner(System.in);
	    String s=scan.next();
	    int min=2;
	    int max=3;
	    
        System.out.println(canReach(s,min,max));
	  
	}
}
