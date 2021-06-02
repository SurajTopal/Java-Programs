/**
There are total n number of Monkeys sitting on the branches of a huge Tree. As travelers offer Bananas and Peanuts,
the Monkeys jump down the Tree.  If every Monkey can eat k Bananas and j Peanuts.
If total m number of Bananas and p number of Peanuts are offered by travelers,
calculate how many Monkeys remain on the Tree after some of them jumped down to eat.
At a time one Monkeys gets down and finishes eating and go to the other side of the road.
The Monkey who climbed down does not climb up again after eating until the other Monkeys finish eating.
Monkey can either eat k Bananas or j Peanuts. If for last Monkey there are less than k Bananas left on the ground 
or less than j Peanuts left on the ground, only that Monkey can eat Bananas(<k) along with the Peanuts(<j).


Write code to take inputs as n, m, p, k, j and return  the number of Monkeys left on the Tree.
    Where, n= Total no of Monkeys
        k= Number of eatable Bananas by Single Monkey (Monkey that jumped down last may get less than k Bananas)
        j = Number of eatable Peanuts by single Monkey(Monkey that jumped down last may get less than j Peanuts)
        m = Total number of Bananas
        p  = Total number of Peanuts
Remember that the Monkeys always eat Bananas and Peanuts, so there is no possibility of k and j having a value zero

*/
import java.util.Scanner;
class MonkeyLeft
{
	public static void main(String args[])
	{
	   Scanner scan=new Scanner(System.in);
        int totalM=scan.nextInt();
        int eatB=scan.nextInt();
        int eatP=scan.nextInt();
        int totalB=scan.nextInt();
        int totalP=scan.nextInt();
        int count=0; // calculate extra peanut and banana
		if(totalM<1 || eatB>totalB || eatP>totalP || eatP<=0 || eatB<=0 )
		{
			System.out.println("INVALID INPUT");
		}
        else
		{
			if(totalB%eatB>0)
			{
				count++;
			}
			if(totalP%eatP>0)
			{
				count++;
			}
			System.out.println("count : "+count);
			
			count=count + totalB/eatB ;
			System.out.println("Banana : "+ count);
			count=count + totalP/eatP ;
			System.out.println("total  : "+ count);

			count=totalM-count;
			if(count < 0)
			{
				System.out.println("INVALID  INPUT");
			}
			else
			{
				System.out.println("Number of  Monkeys left on the tree :"+count);
			}
             				
		}
	
    		
	}
}