/*
 * Class that keeps track of the following information 
 * for a library book:
 * -The title
 * -The author
 * -The Library of Congress catalog number
 * -The publisher
 * -The year of publication
 * -Whether the book is circulation or non-circulating.
 */
public class LibraryRecord {
	public LibraryRecord(String title, String author, int num, String publisher, int year, boolean flag ){
		bookTitle = title;
		bookAuthor = author;
		catalogNumber = num;
		publisherName = publisher;
		publicationYear = year;
		circulating = flag;
	}
	
	public LibraryRecord(String title, String author, int num, String publisher, int year ){
		bookTitle = title;
		bookAuthor = author;
		catalogNumber = num;
		publisherName = publisher;
		publicationYear = year;
	}
	public String getBookTitle(){
		return bookTitle;
	}
	public String getBookAuthor(){
		return bookAuthor;
	}
	public int getCatalogNumber(){
		return catalogNumber;
	}
	public String getPublisherName(){
		return publisherName;
	}
	public int getPublicationYear(){
		return publicationYear;
	}
	public void setCirculating(boolean flag){
		circulating = flag;
	}
	public boolean isCirculating(){
		return circulating;
	}
	
	public String toString(){
		return "Book title : \"" + bookTitle+ "\"" + "\n" + "Written by: " + 
				bookAuthor + "\n" + "The Library of Congress catalog number: " + catalogNumber + "\n" +  
				"Published at: " + publisherName + "\n" + "Publication year: " + 
				publicationYear + "\n" + "Circulating: " + isCirculating();
	}
	
	private String bookTitle;
	private String bookAuthor;
	private int catalogNumber;
	private String publisherName;
	private int publicationYear;
	private boolean circulating;
}
