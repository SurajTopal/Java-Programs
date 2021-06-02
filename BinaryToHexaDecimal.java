import java.util.Scanner;
import java.lang.Math;
class BinaryToHexaDecimal
{
	
	static char choose(int b)
	{
		//System.out.println("B : "+b);
		switch(b)
		{
			case 10: return 'A';
			case 11: return 'B';
            case 12: return 'C';
            case 13: return 'D';
            case 14: return 'E';
            case 15: return 'F';    	
		}
		return 'x';
	}
	
  public static void main(String args[])
  {
     Scanner scan=new Scanner(System.in);
	 String binary=scan.next();
	 char ch[]=binary.toCharArray();
	 int count=0;
	 int i=binary.length()-1;
	 String str="";
	 int b=0;
	 while(i>=0)
	 {
		 int d=ch[i]-'0';
		 if(count==3)
		 {
			 count=0;
			        if(b>=10)
			         str=choose(b)+str;
				      else
				     str=b+str;
			 b=0;
		 }
		 int num=(int)Math.pow(2,count);
         System.out.println(" Num ; "+num);
		 //System.out.println("b : = b + d * num");
		// System.out.println("b : = "+b+"+"+d+"* "+num);
				
 		 b=b+d*(int)Math.pow(2,count);
		
		if(i==str.length()-1)
		 {
			 str=choose(b)+str;
		 }
		 count++;
		 i--;
	 }
	 System.out.println("Result : "+str);
  }
}