class StudentClass implements Student
{
	
	public String getName()
	{
		return name;
	}
   public static void main(String args[])
   {
       StudentClass obj=new StudentClass();
       
       System.out.println(obj.getName());	   
   }
}