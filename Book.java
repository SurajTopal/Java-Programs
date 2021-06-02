/*
Derive a class called Book from Media.
 This class has additional field variables, author and edition.
 Provide appropriate constructors, and required methods in the class. 
*/
import java.util.Scanner;
class Book extends Media
{
	String author;
	String edition;
	Book(String author , String edition)
	{
		
		this.author=author;
		this.edition=edition;
	}
	
	void displayDetails()
	{
		setTitle("BEST FOR EVER");
		System.out.println("Title : "+getTitle());
		System.out.println("Author : "+author);
		System.out.println("Edition : "+edition);
	}	
}