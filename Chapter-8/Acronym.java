/*
 * Chapter 8, exercise 16, Acronym
 */
import acm.program.*;
import java.util.*;
public class Acronym extends ConsoleProgram {
	public void run(){
		String line = "Since the problem is to translate.";
		println("The acronum for the " + "\"" + line+ "\"" + " is: " + acronym(line));
	}
	private String acronym(String str){
		String acronym = "";
		StringTokenizer tokenizer = new StringTokenizer(str, DELIMITERS, false);
		while(tokenizer.hasMoreTokens()){
			String token = tokenizer.nextToken();
			char ch = token.charAt(0);
			acronym += ch;
		}
			
		return acronym;
	}
	private static final String DELIMITERS = "!@#$%^&*()_-+={[}]:;\"'<,>.?/~`|\\ ";
}
