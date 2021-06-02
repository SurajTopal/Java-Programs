class A 
{
  int c=30;
  private int a=10;
  protected int b=20;
  private void display()
  {
	  System.out.println("A class method is working..");
  }
}
class AccessModifier1 
{
   private void display()
   {
	   System.out.println("Access Modifier1 is working..");
   }
  public static void main(String args[])
  {
     AccessModifier1 obj=new AccessModifier1();
	 obj.display();	 
  }
}