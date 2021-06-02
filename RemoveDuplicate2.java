class RemoveDuplicate2
{
public static void main(String...S)
{
        RemoveDuplicate m = new RemoveDuplicate();

        for(int i=0;i<m.s1.length;i++)
        {
			for(int j=0;j<m.s2.length;j++)
			{
				if(m.s1[i]==m.s2[j])
				{
					 m.exchange(j);
				}
				
			}
		}
        for(String s3: m.s1)
          System.out.print(s3+ " ");
		  
	   for(String s4: m.s2)
           System.out.print(s4+ " ");
     }
}