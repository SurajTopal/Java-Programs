//Ma'am actually this is my old program that's why I have not created separate class 
//it is time taking process.
//and I have some modification to store and result in the file. 

import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Random;
  class SumGame
  {
	  int sum(int n1 ,int n2)
	  {
		  return n1+n2;
	  }
	  
     public static void main(String args[]) throws Exception
	 {
	    Scanner scan=new Scanner(System.in);
		SumGame obj=new SumGame();
		    
		  Random r=new Random();
		  int correct=0,wrong=0;
		  boolean execute=true;
		  int i=0,n1,n2,sum=0;
		  char run='n';
		  System.out.println("Enter File Name : - ");
		  String name=scan.next();
		  File file=new File("D:\\java program\\"+name+".txt\"");
		  name=name+".txt";
		  FileWriter writer=new FileWriter(name);
	
		  do
		  {
					n1=n2=0;
					  
				  System.out.println("Select mode : Easy -> e or E and Difficult -> d or D \n");

				   char mode=scan.next().charAt(0);
				
				 if(mode=='e' || mode=='E')
				  {
					  n1=r.nextInt(10);
					  n2=r.nextInt(10);
					
				  }			  
				  else if(mode=='d' || mode=='D')
				  {
					 n1=r.nextInt(100);
					 n2=r.nextInt(100);
				  }
				  else
				  {
					  System.out.println("Opps! Something went wrong..");          
				  }
		  
					  System.out.println("n1 : "+n1);
					  System.out.println("n2 : "+n2);
					  
					if(n1!=0 || n2!=0)
                    { 						
						  System.out.println("-----Enter Sum----");
						  try
						  {
									 sum=scan.nextInt();
								  
								  int result=obj.sum(n1,n2);
								  
								  
								  
								  //Store Result in a file ....
								  try
								  {
									  writer.write("Correct Result : "+result+"    User Input : "+sum+"   \n\n");
								  }
								  catch(IOException e)
								  {
									  System.out.println("An error Occured..");
								  }
				
								  
								  if(sum==result)
								  {  
									  correct++;
									  System.out.println("---Congratulations Correct Answer---\n\n");
								  }		
								  else
								  {
									   wrong++;							  
									  System.out.println("---Opps! You gave Wrong Answer---\n\n");				
								  }
								   obj.sum(n1,n2);
							

									System.out.println("\n\n---Do you want to continue ? yes -> y and No -> any except y \n\n");
									 run=scan.next().charAt(0);
													
									if(run!='y')
											execute=false;							
					      
						   }
						  catch(Exception e)
						  {
							  execute=false;
							  System.out.println("----Opps! Wrong Input----");
						  }
					}
                    else
                    {
						execute=false;
						System.out.println("----Opps! Wrong Input----");
					}						
					
		  }while(execute); 
		  
		  int total=wrong+correct;
		                           try
								  {
									  writer.write("Total Question  : "+total+"\n\n    Correct Question : "+correct+"   \n\n");
								  }
								  catch(IOException e)
								  {
									  System.out.println("An error Occured..");
								  }
		  if(correct > total/2 )
			  System.out.println("You are Pass : "+"\n Total Marks :  "+correct);
		  else
			  System.out.println("you are Fail : "+"\n Total Marks : "+correct);
		  
		  System.out.println("\n  Wrong Answer : "+wrong);
		  writer.close();
	 }
  }