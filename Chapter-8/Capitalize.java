/*
 * Implement a method capitalize(str) that returns a string in which the 
 * initial character is capitalized (if it is a letter) and all the other letters 
 * are converted so that they appear in lower case form. Characters other than letters
 * should not be affected; thus, capitalize("BOOLEAN") and capitalize("boolean") should 
 * each return the string "Boolean".
 */
import acm.program.*;
public class Capitalize extends ConsoleProgram {
	public void run(){
		String str = readLine("Enter a string: ");
		println(capitalize(str));
		
	}
	private String capitalize(String str){
		char firstCh = str.charAt(0);
		String head = str.substring(0, 1);
		String body = str.substring(1);
		
		String firstCap = "";
		String restOfWord = "";
		
		if(!(isDigit(firstCh))){
			firstCap = head.toUpperCase();
			restOfWord = body.toLowerCase();
		}
		
		return firstCap + restOfWord;
	}
	private boolean isDigit(char firstCh) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
