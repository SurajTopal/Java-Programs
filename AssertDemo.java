import java.util.Scanner;
  class AssertDemo
  {
		public static void main(String args[])
		{
		  Scanner scan=new Scanner(System.in);
		  int age=scan.nextInt();
		  assert(150>age):"Age is greater than 150";
		  if(age<100)
			  System.out.println("Age is less than 100  : "+age);
		  else
			  System.out.println("Age is greater than 100  :"+age);
		}
  }