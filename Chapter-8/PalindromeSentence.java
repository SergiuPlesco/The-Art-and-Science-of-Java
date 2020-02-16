/*
 * The concept of palindrome extended to full sentences by ignoring punctuation
 * an differences in the case of letters.
 * For example, the sentence
 * 		
 * 		Madam, I'm Adam
 * 
 * is a sentence palindrome, because if you only look at the letters and ignore any 
 * distinction between uppercase and lowercase letters, it reads identically backward and forward.
 * Write a predicate method isSentencePalindrome(str) that returns true if the string str fits
 * this definition of a sentence palindrome. 
 */
import java.util.StringTokenizer;

import acm.program.*;
public class PalindromeSentence extends ConsoleProgram {
	public void run(){
		println("This program check for sentence palindrome.");
		println("Indicate the end of the input with a blank line.");
		String str = "";
		while(true){
			str = readLine("Enter a sentence to check if it is palindrome: ");
			if(str.trim().equalsIgnoreCase("")){
				break;
			} else if(isSentencePalindrome(str)){
				println("true");
			} else {
				println("false");
			}
			
		}
		println("The end of testing.");
	}
	private boolean isSentencePalindrome(String str){
		StringTokenizer tokenizer = new StringTokenizer(str, DELIMITERS);
		String reverse = "";
		String token = "";

		while(tokenizer.hasMoreTokens()){
			reverse += tokenizer.nextToken();
		}
		
		for(int i = reverse.length()-1; i >= 0; i--){
			char ch = reverse.charAt(i);
			token += ch;
		}
		
		if(reverse.equalsIgnoreCase(token)){
			return true;
		}
		
		println(reverse + " reverse: " + token);
		return false;
	}
	private static final String DELIMITERS = "!@#$%^&*()_-+={[}]:;\"'<,>.?/~`|\\ ";
}
