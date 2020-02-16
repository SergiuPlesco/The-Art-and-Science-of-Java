/*
 * 
 */
import acm.program.*;
public class LibraryRecordCall extends ConsoleProgram {
	public void run(){
		String title = "The art of Java";
		String author = "Eric Roberts";
		int catalogNumber = 12345;
		String publisher = "Pearson";
		int year = 2007;
		boolean circulating = false;
		LibraryRecord record = new LibraryRecord(title, author, catalogNumber, publisher, year, circulating);
		println(record);
	}
	
}
