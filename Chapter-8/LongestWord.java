/*
 * Chapter 8, exercise 15, longest word in a sentence
 * plus second longest and shortest
 */


import acm.program.*;
import java.util.*;
public class LongestWord extends ConsoleProgram {
	public void run(){
		String line = readLine("Enter a line: ");
		println("The longest word is: " + longestWord(line) + ".");
	}
	private String longestWord(String line){
		
		StringTokenizer tokenizer = new StringTokenizer(line, DELIMITERS, true);
		String token = tokenizer.nextToken();
		String longestWord = token;
		String secondLongestWord = token;
		String shortestWord = token;
		
		int tokenLength = token.length();
		int longestTokenLength = tokenLength;
		int secondTokenLength = tokenLength;
		int smallestTokenLength = tokenLength;
		
		while(true){
			String nextToken = tokenizer.nextToken();
			int nextTokenLength = nextToken.length();
			if(nextTokenLength > longestTokenLength){
				secondLongestWord = longestWord;
				secondTokenLength = longestTokenLength;
				
				longestWord = nextToken;
				longestTokenLength = nextTokenLength;
			} else if(longestTokenLength == secondTokenLength || (nextTokenLength > secondTokenLength && nextTokenLength != longestTokenLength)){
				secondLongestWord = nextToken;
				secondTokenLength = nextTokenLength;
			}
			if(nextTokenLength < smallestTokenLength){
				shortestWord = nextToken;
				smallestTokenLength = nextTokenLength;
			}
			if(!(tokenizer.hasMoreTokens())) break;
		}
		
		
		
		return "LONGEST: " + longestWord + " /SECOND LONGEST: " + secondLongestWord + " /SHORTEST: " + shortestWord;
	}
	
	private static final String DELIMITERS = "!@#$%^&*()_-+={[}]:;\"'<,>.?/~`|\\ ";
}
