class ExtendBookStore extends BookStore
{
  public static void main(String args[])
  {
     ExtendBookStore obj=new ExtendBookStore();
	 obj.addBook();
     obj.bill();
	 System.out.println("Book Store Stock ");
	 System.out.println("BOOK NAME    :   STOCK  ");
	 for(int i=0;i<3;i++)
	 {
		 System.out.println("   "+obj.bookName.get(i)+"   "+obj.bookStock.get(i));
	 }
  }
}