 class A
{
 private  int a=10;
  int get(int b)
  {	  
       a=b;
	   System.out.println(a);
	   return a;
  }
  
   int geta()
   {
	   return a;
   }
}   
   
    class Private extends A{  
         Private()
		 {
			System.out.println(get(5)); 
			System.out.println(geta());
		 }
          
           
        public static void main(String args[]){  
         Private o=new Private();
		 //o.display();
        }      
    }  