/**
Sweet Seventeen Problem Statement

Given a maximum of four digit to the base 17 
(10 – A, 11 – B, 12 – C, 13 – D … 16 – G} as input, output its decimal value.

    Input – 23GF
    Expected Output – 10980

*/
import java.util.Scanner;
class HexaToDecimal
{
    public static void main(String args[])
    {
       Scanner scan=new Scanner(System.in);
       String str=scan.nextLine();
       char ch[]=str.toCharArray();
        double decimal=0;
        int in=0;
        int base =17;
        int j=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            in=ch[i]-'0';
            
            if(ch[i]=='1' || ch[i]=='2' || ch[i]=='3' || ch[i]=='4' || ch[i]=='5' || ch[i]=='6' || ch[i]=='7' || ch[i]=='8' || ch[i]=='9')
            {
                decimal=decimal+in*Math.pow((double)base,(double)j);
            }
            else if(ch[i]=='A')
            {
                decimal=decimal+ 10*Math.pow((double)base,(double)j);
            }
            else if(ch[i]=='B')
            {
                decimal=decimal+ 11*Math.pow((double)base,(double)j);
            }
            else if(ch[i]=='C')
            {
                decimal=decimal+ 12*Math.pow((double)base,(double)j);
            }
            else if(ch[i]=='D')
            {
                decimal=decimal+ 13*Math.pow((double)base,(double)j);
            }
            else if(ch[i]=='E')
            {
                decimal=decimal+ 14*Math.pow((double)base,(double)j);
            }
            else if(ch[i]=='F')
            {
                decimal=decimal+ 15*Math.pow((double)base,(double)j);
            }
            else if(ch[i]=='G')
            {
                decimal=decimal+ 16*Math.pow((double)base,(double)j);
            }
            
            j++;
        }
        
        System.out.println((int)decimal);
        
    }
}