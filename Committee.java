/**
Example 1: When there are more than one child members 
Input : (Do not give input prompts.Accept values as follows. )
Amit                     //Enter parent Member as this
Y                           //Enter Y if  Parent member has child members otherwise enter N
Rajesh,Virat        //Enter names of child members of Amit in comma separated
Output:(Final Output must be in format given below.)
TOTAL MEMBERS:3
COMISSION DETAILS
Amit: 1000 INR
Rajesh :250 INR
Virat: 250 INR	
*/


import java.util.Scanner;
 class Committee
 {
   public static void main(String args[])
   {
     Scanner scan=new Scanner(System.in);
	 int schemeAmount=5000;
	 String name=scan.next();
	 String children=scan.next();
	 
	 if(children.equals("Y"))
	 {
         scan.nextLine(); 		 
		 String c=scan.nextLine();
		 System.out.println("Name : "+c);
		 String childrenName[]=c.split(",");
		 int totalMember=1+childrenName.length;
		 int parentCommision=500*childrenName.length;
		 System.out.println("Total Members : "+totalMember);
		 System.out.println("Commission Details : ");
         System.out.println(name+"  :"+parentCommision+" INR"); 
		 for(String n: childrenName)
		 {
			 System.out.println(n+" : 250 INR");
		 }
	 }
	 else
	 {
		 System.out.println("Total Members : 1");
		 System.out.println("Commission Details : ");
		 System.out.println(name+" : 250 INR");
	 }
   }
 }