/*
One programming language has the following keywords that cannot be used as identifiers:

break, case, continue, default, defer, else, for, func, goto, if, map, range, return, struct,
 type, var

Write a program to find if the given word is a keyword or not

*/
import java.util.Scanner;
class keywordClass
{
	public static void main(String[] args)
	{
	    
		Scanner scan = new Scanner(System.in);
	    String input=scan.next();
	    String str[]={"defer","while","break","case","continue","default","else","for","func","goto","if","map","range","return","struct","type","var"};
	    boolean result=false;
	    for(int i=0;i<str.length;i++)
	    {
	        int r=input.compareTo(str[i]);
	        if(r==0)
	        {
	            System.out.println(input+" is a keyword");
	            result=true;
	            break;
	        }
	    }
	    if(result==false)
	    {
	        System.out.println(input+" is not a keyword");
	    }
	    
	}
}