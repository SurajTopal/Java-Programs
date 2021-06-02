import java.util.Scanner;
class FractionSum
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
	System.out.println("Enter the String : ");
	String str=scan.nextLine();
	char s[]=str.toCharArray();
	int count=0;
	int x,y,u,v=0,a,b;
	str="";
	int i=0;
	while(count!=1)
	{
	    	if(s[i]!='/')
			  str+=s[i];
		     else 
			   count++;
			i++;
	}
	x=Integer.parseInt(str);
	str="";
	while(count!=2)
	{
	    	if(s[i]!='+')
			  str+=s[i];
		     else 
			   count++;
			i++;
	}
	y=Integer.parseInt(str);
	System.out.println(x+"/"+y);
	str="";
	while(count!=3)
	{
	    	if(s[i]!='/')
			  str+=s[i];
		     else 
			   count++;
			i++;
	}
	u=Integer.parseInt(str);
	str="";
	while(i<str.length())
	{
		System.out.println(i);
			  str+=s[i];
	           i++;
	}
	try
	{
	v=Integer.parseInt(str);
    }catch(Exception e)
	{System. out.println(e);}
	System.out.println(u+"/"+v);
	
  }
}