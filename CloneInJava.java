\\Java array implement the Cloneable interface, we can create
\\the clone of the Java array. If we create the clone of a single-dimensional
\\ array, it creates the deep copy of the Java array. It means, it will copy the actual value. 
\\But, if we create the clone of a multidimensional array, it creates the 
\\shallow copy of the Java array which means it copies the references.
   class CloneInJava
   {
      public static void main(String args[])
	  {
	    int a[]={1,2,3,4,5};
		// Original Array : 
		for(int val : a)
		{
		  System.out.println(val);
		}
		int copy[]=a.clone();
		
		System.out.println("Are they SAME ?");
		System.out.println(copy==a);
		// Copy Array : 
	    	for(int val : copy)
		{
		  System.out.println(val);
		} 	
		
	  }
   }
   