/**
    He first turns and travels 10 units of distance
    His second turn is upward for 20 units
    Third turn is to the left for 30 units
    Fourth turn is the downward for 40 units
    Fifth turn is to the right(again) for 50 units
… And thus he travels, every time increasing the travel distance by 10 units.
*/
import java.util.Scanner;
public class DirectionProblem

{
	public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 int step=scan.nextInt();
	 int xincr=0,yincr=0,x=0,y=0;
	 char c='A';
	 for(int i=1;i<=step;i++)
	 {
	     switch(c)
	     {
	         case 'A' :
	                    xincr=xincr+10;
	                    x=x+xincr;
	                    c='B';
	                    break;
	             case 'B' :
	                    yincr=xincr+10;
	                    y=y+yincr;
	                    c='C';
	                    break;
	                 case 'C' :
	                     xincr=yincr+10;
	                     x=x-xincr;
	                     c='D';
	                     break;
	                     case 'D' :
	                         yincr=xincr+10;
	                         y=y-yincr;
	                         c='E';
	                         break;
	                         case 'E' : 
	                            xincr=yincr+10;
            	                x=x+xincr;
            	                c='A';
            	                     
	     }
	 }
	 System.out.println("x : "+x+" , y : "+y);
	}
}
