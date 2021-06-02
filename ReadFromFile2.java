class ReadFromFile2
{
   public static void main(String args[]) throws Exception
   {
     RemoveDuplicateReadFromFile obj=new RemoveDuplicateReadFromFile();
	 
	 obj.fetchFromFile();
	  for(int i=0;i<obj.list1.length;i++)
        {
			for(int j=0;j<obj.list2.length;j++)
			{
				if(obj.list1[i].equals(obj.list2[j]))
				{
					 obj.exchange(j);
				}
				
			}
		}
		
	   for(String name: obj.list1)
          System.out.print(name+ " ");
		  
	   for(String name: obj.list2)
           System.out.print(name+ " ");	
   }
}