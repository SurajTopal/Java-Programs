import java.util.*;
class BookStore extends Books
{
      public List<String> bookName=new ArrayList<String>();
	  public List<Integer> bookStock=new ArrayList<Integer>();
	  String name;
	  String stock;
	  
  public void addBook()
   {
       Scanner scan=new Scanner(System.in);
	   for(int i=0;i<3;i++)
	   {
		   System.out.println("\nPlease Add Book and its stock.");
		   String bookNme=scan.next();
		   int bookStk=scan.nextInt();
		   bookName.add(bookNme);
		   bookStock.add(bookStk);
	   }
	   
   }
   
  public String [] customerOrder()
   {
	   
	   String orderDetails[]=new String[2];
	    orderDetails[0]=name;
		orderDetails[1]=stock;
		return orderDetails;
		
   }
  public int searchBook()
  {
	  int index=0;
	  String order[]=customerOrder();
	  
	  for(String bName : bookName)
	  {
		  if(bName.equals(order[0]))
			  return index;
		  index++;
	  }
	  return index=-1;
	  
  }  
   
  public void bill()
  {
	  Scanner scan=new Scanner(System.in);
	  int totalBill=200;

	  System.out.println("ENTER ORDER DETAILS : -  ");
	   name=scan.next();
	   stock=scan.next();


	  String orderDetails[]=customerOrder();	  
	  System.out.println("Each Book rate : 200 Rs ");
	  if(-1<searchBook())
	  {
		  System.out.println("Book is Found : -");
		  int totalBooks=bookStock.get(searchBook());
		
		if(totalBooks>Integer.parseInt(orderDetails[1]))  
		  {
			  totalBill*=Integer.parseInt(orderDetails[1]);
			  bookStock.set(searchBook(),totalBooks-Integer.parseInt(orderDetails[1]));
			  
		  }  
		  else
		  {
			  totalBill*=totalBooks;
			  bookStock.set(searchBook(),0);
		  }

		  System.out.println("BookName : "+orderDetails[0]);
		  System.out.println("No. of Books : "+orderDetails[1]);
		  System.out.println("Total Bill : "+totalBill);
	  }
	  else
	  {

		  System.out.println("BOOK IS NOT FOUND : TOTAL BILL - "+totalBill);

	  }
	  
	  
  }  
}