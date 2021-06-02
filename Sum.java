/*
 Using a method, pass two variables and find the sum of two numbers.
Test case:
Number 1 – 20
Number 2 – 20.38
Sum = 40.38

There were a total of 4 test cases. Once you compile 3 of them will be shown to you and
 1 will be a hidden one.
 You have to display error message if numbers are not numeric.
*/
class Sum
{
  public static void main(String args[])
  {
	  try
	  {
    double num=Double.parseDouble(args[0]);
	double num1=Double.parseDouble(args[1]);
	System.out.println("sum : "+(num+num1));
      }
	  catch(NumberFormatException e)
	  {
		  System.out.println("Number is not numeric");
	  }
  }
}