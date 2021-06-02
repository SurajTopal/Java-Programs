/*
Suppose you are writing an application for a cheque processing system. 
A check will have money in both figures and words. 
Write a method that takes a string that represents money in words and
 a number that represents the money in figures. 
The method checks if these two represent the same money value and returns true 
if so and returns false if not. 

NOTE : - This program limit to check number 9999
*/
import java.util.Scanner;
 class NumberToWords
 {
  static boolean checkNumberWords(String number,int n)
   {
	  String ones[]={"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	  String tens[]={"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
 	  String str="";
	  int no=0;
	  if(n%100>19)
	  {
		  if(n%100<=99 && n%10!=0)
		  {
		      no=n%10;
		      str=ones[no-1]+" "+str;
			  int r=n%100-n%10;
			  r=r/10-2;
			  str=tens[r]+" "+str;
		  }
		  else
		  {
			  no=((n%100)/10)-2;
			  str=tens[no]+" "+str;
		  }
	  }
	  else if((n%10!=0 && n%100<=19)||(n%100==10))
	  {
		   no=n%100;
		  str=ones[no-1]+" "+str;
	  }
	   if(n%1000 >99)
	   {
		    no=((n%1000)-(n%100))/100;
			str=ones[no-1]+" hundred "+str;
	   }
	   if(n%10000 >999)
	   {
		   no=((n%10000)-(n%1000))/1000;
		   str=ones[no-1]+" thousand "+str;
	   }	
	   
	  System.out.println(str+":");
	  System.out.println(number+":");
	  if(str.equals(number))
		  return true;
	  return false;
   }
     
   public static void main(String args[])
   {
      Scanner scan=new Scanner(System.in);
	  System.out.println("Enter a number : ");
	  int n=scan.nextInt();
	  scan.nextLine();
	  System.out.println("Enter a number in words : ");
	  String number=scan.nextLine();
	  System.out.println("Result : "+checkNumberWords(number,n));
   }
 }
