import java.util.Scanner;
import java.io.File;
public class RemoveDuplicateReadFromFile
{
   String list1[]=new String [5];
   String list2[]=new String [5];
   
   void fetchFromFile() throws Exception
   {
	 File file=new File("D:\\java program\\list1.txt");
	 File file2=new File("D:\\java program\\list2.txt");
     Scanner scan=new Scanner(file);
	 Scanner scan2=new Scanner(file2);
	 int i=0;
	 try
	 {
	  while (scan.hasNextLine())
	  {
		  list1[i]=scan.next();
		  i++;
      }
	   i=0;
	  while (scan2.hasNextLine())
	  {
		  list2[i]=scan2.next();
		  i++;
      }
     }
     catch(Exception e)
	 {
		 System.out.println(e);
	 }	 
   }

   void exchange(int n)
 {
    int index=list2.length-1;	
    for(int i=n;i<list2.length-1;i++)
        {
          list2[i]=list2[i+1];
        }
        list2[index]="";
        index--;
 }
}
