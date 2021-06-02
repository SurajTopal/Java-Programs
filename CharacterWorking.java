import java.util.Scanner;
class CharacterWorking
{
   public static void main(String args[])
   {
     Scanner scan=new Scanner(System.in);
	 String s=scan.nextLine();
	 for(int i=0;i<s.length();i++)
	 {
		 if(i%2==0)
		   System.out.print(Character.toUpperCase(s.charAt(i)));
	     else
           System.out.print(Character.toLowerCase(s.charAt(i))); 			 
	 }
	 
	 for(int i=0;i<s.length();i++)
	 {
		 if(Character.isLetter(s.charAt(i)))
		 {
			 System.out.println("Letter : "+s.charAt(i));
		 }
		 else if(Character.isDigit(s.charAt(i)))
		 {
			 System.out.println("Digit : "+s.charAt(i));
		 }
		 else if(Character.isWhitespace(s.charAt(i)))
		 {
			 System.out.println("White Space : "+s.charAt(i));
		 }
		 else
		 {
			 System.out.println("Symbol : "+s.charAt(i));
		 }
	 }
   }
}