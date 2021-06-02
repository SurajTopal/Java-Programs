    class A
	 {  
      protected void msg()
	  {  
		  System.out.println("Hello java");
	  }  
    }  
      
    public class AccessModifier extends A
	{   
     public static void main(String args[]){  
       AccessModifier obj=new AccessModifier(); 
       obj.msg();  
       }  
    }  