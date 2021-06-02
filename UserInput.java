class BB
{
    void show();
}
class AA{
	void print()
	{
		System.out.println("Hello AA");
	}
}
public class UserInput extends AA,BB 
{
      public void show()
      {
          System.out.println("Hello World....");
      }
     public static void main(String []args){
         UserInput obj=new UserInput();
         obj.show();
       
     }
}
