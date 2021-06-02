/**
   There is a JAR full of candies for sale at a mall counter. JAR has the capacity N, that is JAR can contain maximum N candies when JAR is full.
   At any point of time. JAR can have M number of Candies where M<=N. Candies are served to the customers.
   JAR is never remain empty as when last k candies are left. JAR if refilled with new candies in such a way that JAR get full.
Write a code to implement above scenario. Display JAR at counter with available number of candies.
 Input should be the number of candies one customer can order at point of time. Update the JAR after each purchase and display JAR at Counter.

Output should give number of Candies sold and updated number of Candies in JAR.

If Input is more than candies in JAR, return: INVALID INPUT

*/

import java.util.Scanner;
public class Candies
{
	public static void main(String[] args)
	{
       Scanner scan=new Scanner(System.in);
       int totalCandies=10;
       int number =scan.nextInt();
           if(number >=1 && number <=5)
           {
               System.out.println("Number of candies Sold  : "+number);
               System.out.println("Number of candies available in the jar : "+(totalCandies-number));
           }
           else
           {
               System.out.println("Invalid Input");
               System.out.println("Number of candies available in the jar : 10");
           }
	}
}
