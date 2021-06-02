 import java.util.*;
 class HashMapBook extends BookStore 
{
   public static void main(String args[])
   {
	 HashMapBook obj=new HashMapBook();
     obj.addBook();
	 
	 
	
     Map<String,Integer> map=new HashMap<String,Integer>();
     
	 for(int i=0;i<3;i++)
	 {
		  map.put(obj.bookName.get(i),obj.bookStock.get(i));
	 }		 
	 
	 System.out.println(map); 
   
   }
}