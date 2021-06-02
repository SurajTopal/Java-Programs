/**
Path = [800, 600, 750, 900, 1400, 1200, 1100, 1500]
BusStops = [ “TH”, ”GA”, ”IC”, ”HA”, ”TE”, ”LU”, ”NI”,”CA” ]
Write a code with function getFare(String Source, String Destination) which take Input as source 
 and destination stops(in the format containing first two characters of the Name of the Bus Stop) and calculate and return travel fare.
 If d =1000 metres, then fare=5 INR (When calculating fare for others, the calculated 
 fare containing any fraction value should be ceiled. For example,
for distance 900n when fare initially calculated is 4.5 which must be ceiled to 5)
Example 1:
Input Values
ca
Ca

Output Values
INVALID OUTPUT

Example 2:
Input Values
NI
HA
Output Values
23.0 INR

*/


import java.util.Scanner;
class StopFare
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
	int path[]={800, 600, 750, 900, 1400, 1200, 1100, 1500};
    String busPath[]={"TH", "GA", "IC", "HA", "TE", "LU", "NI","CA"};
	
	String source=scan.next();
	String destination=scan.next();
	int index1=-1;
	int index2=-1;
	
	for(int i=0;i<busPath.length;i++)
	{	
		if(source.equals(busPath[i]))
			index1=i;
		if(destination.equals(busPath[i]))
			index2=i;
		if(index1>=0 && index2>=0)
			break;
	}
	int p=0;
	if(index1==-1 || index2==-1)
	{
		System.out.println("INVALID INPUT");
	}
    else
	{
			if(index1>index2)
		{
		  for(int i=index2;i<=index1;i++)
		  {
			  p=p+path[i];
		  } 		  
		}
		else 
		{
		   for(int i=index1;i<=index2;i++)
		   {
			   p=p+path[i];
		   }
		}
	
	float result=p/1000;
    float decimal=(p%1000)/200;
	result=result*5+(int)Math.ceil((double)decimal);
	System.out.printf("%.1f INR",result);
			
	}
         
  }
  
}