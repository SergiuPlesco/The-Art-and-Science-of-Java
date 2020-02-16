/*
 * Write a method createDateString(day, month, year) that returns a string
 * consisting of the day of the month, a hyphen, the first three letters 
 * in the name of the month, another hyphen, and the last two digits of 
 * the year. For example, calling the method 
 * 		
 * 		createDateString(22, 11, 1963)
 * 
 * should return the string "22-Nov-63".
 */
import acm.program.*;
public class DateString extends ConsoleProgram{
	public void run(){
		int day = readInt("Enter the day: ");
		int month = readInt("Enter the month: ");
		
		int year = readInt("Enter the year: ");
		createDateString(day, month, year);
	}
	private void createDateString(int day, int month, int year) {
		println(day + "-" + getMonth(month) + "-" + getYear(year));
		
	}
	private String getMonth(int month) {
		switch(month){
		case 1: return "Jan";
		case 2: return "Feb";
		case 3: return "Mar";
		case 4: return "Apr";
		case 5: return "May";
		case 6: return "Jun";
		case 7: return "Jul";
		case 8: return "Aug";
		case 9: return "Sep";
		case 10: return "Oct";
		case 11: return "Nov";
		case 12: return "Dec";
		default: return "No such munth";
		}
	}
	
	private String getYear(int year){
		String fullYear = Integer.toString(year);
		String twoDigitsYear = fullYear.substring(2);
		return twoDigitsYear;
	}
}
