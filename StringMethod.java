import java.util.Scanner;
class StringMethod
{
  public static void main(String args[])
  {
	  Scanner scan=new Scanner(System.in);
     //equals() method compare string and return true or false
	 if(args[0].equals(args[1]))
	 {
		 System.out.println("Strings are equals ");
	 }
	 else
	 {
		 System.out.println("String are not equals ");
	 }


     boolean result=args[0].contains("suraj");
	 System.out.println(result);
	 System.out.println(args[0].substring(5));
	 
	 char ch[]=args[0].toCharArray();
	 for(char c:ch)
	 {
		 System.out.print(" "+c);
	 }
	 
	 String str=scan.nextLine();
	 String separate[]=str.split(",");
	 System.out.println(str.trim());
	 for(String res:separate)
	 {
		 System.out.println(" "+res);
	 }
  }
}