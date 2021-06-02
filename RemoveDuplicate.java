import java.util.Scanner;
public class RemoveDuplicate
{
 String[] s1={"ram", "mahesh", "priya", "rahul", };
 String[] s2 = {"manoj", "kritika", "suraj", "rahul", "priya"};

void exchange(int n)
{
        int index=s2.length-1;
        for(int i=n;i<s2.length-1;i++)
        {
        s2[i]=s2[i+1];
        }
        
        s2[index]="";
        index--;
}

}
