import java.io.File;
import java.util.Scanner;
public class ReadFromFileUsingScanner
{
  public static void main(String[] args) throws Exception
  {
    // pass the path to the file as a parameter
    File file =  new File("D:\\java program\\test.txt");
    Scanner sc = new Scanner(file);
  
    String name []=new String[3];
    while (sc.hasNextLine())
	{	
      name[i]=sc.next();
	  System.out.println(sc.next());
  
	}
  }
}