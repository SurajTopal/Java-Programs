import java.util.*;
import java.io.*;
//There are basically two stack : -
  //Operand stack - it will collect all operand..
  //Operator stack - it will collect all operator..


class Calculator
{
	static void stack_pushOperand(Stack<Integer> stack,int no)  // add operand to the operand stack
	{
        stack.push(no);
	}
	static void stack_pushOperator(Stack<Character> stack,char ch) // add operator to the operator stack.. 
	{
		stack.push(ch);
	}
	
	static int stack_popOperand(Stack<Integer> stack)   //remove operand from the operand stack..
	{
		int pop=(int)stack.pop();
		return pop;
	}
	
	static char stack_popOperator(Stack<Character> stack)  // remove operator from the operator stack..
	{
		char pop=(char)stack.pop();
		return pop;
	}
	
	
	//Below method perform calculation based on operator 
	/*
	   char pre[] -> where we store all operator which are used to perfom operation... In the precedence wise.. 
	   like subtraction - pre[0]
	        addition    - pre[1]
			multiplication - pre[2]
			division       - pre[3]
			
	*/
	
	static void calculation(Stack<Integer> operandStack, Stack<Character> operatorStack, char pre[],int pretop,char expression[],int i)
	{
								   int b=stack_popOperand(operandStack);
								   int a=stack_popOperand(operandStack);
								   
								   int result=0;
								   
								   switch(pre[pretop])
								   {
									   case '*' : result=a*b;
									              break;
												  
									   case '/' : result=a/b;
									              break;
										
                                       case '+'	: result=a+b;
                                                  break;
												  
                                       case '-' : result=a-b;
                                                  break;									   
								   }
								   stack_pushOperand(operandStack,result);
								   stack_popOperator(operatorStack);
								   stack_pushOperator(operatorStack,expression[i]);		
	}
	
	  public static void main(String args[])
	  {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Expression : ");
		String exp=scan.next();
		char pre[]={'-','+','*','/'};
		char expression[]=exp.toCharArray();
        Stack<Integer> operandStack=new Stack<Integer>();
		Stack<Character> operatorStack=new Stack<Character>();
		int pretop=0,curtop=0;
		int i=0;
		if(expression[0]=='*' || expression[1]=='/' || expression[2]=='+')
			  System.out.println("Invalid Input");
		else
		{
			while(i<exp.length())
		   {
			   if(expression[i]=='+' || expression[i]=='-' || expression[i]=='/' || expression[i]=='*')	
			   {
				   for(int j=0;j<4;j++)
				   {
					   if(expression[i]!=pre[j])
					   {
						   curtop++;
					   }
					   else
					   {
						   break;
					   }
						   if(pretop==0)
						   {
							   pretop=curtop;
							   stack_pushOperator(operatorStack,expression[i]);
						   }
						   else
						   {
							   if(pretop>=curtop)
							   {
	                              calculation(operandStack,operatorStack,pre,pretop,expression,i);							  						   
							   }
						   }
				   }
			   }
			    else
			   {
				   int no=expression[i]-'0';
				   stack_pushOperand(operandStack,no);
				   if(i==exp.length()-1)
				   {
					             calculation(operandStack,operatorStack,pre,pretop,expression,i);							  						   
				   }
			   }
			   i++;
		   }
		  
		}
		
		System.out.println("calculated value is : "+operandStack.peek());
	}	
}


/*
		Stack<Integer> stack=new Stack<Integer>();  
		Stack<Character> stackk=new Stack<Character>();
		stack_push(stack,14);
		stack_push(stack,12);
		System.out.println("POP element  : "+stack_pop(stack));
		System.out.println("POP element : "+stack_pop(stack));
*/