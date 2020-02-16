/*
 * Write a method createRegularPlural(word) that returns the plural of word
 * formed by following these standard English rules: 
 * 
 * 		a) If the word ends in s,x,z,ch, or sh, add es to the word.
 * 		b) If the word ends in y and the y is preceded by a consonant, change the y to ies.
 * 		c) In all other cases, add just an s.
 * 
 * Write a test program and design a set of test cases to verify that your program works.
 */
import acm.program.*;
public class RegularPlural extends ConsoleProgram {
	public void run(){
		println("This program creates regular plural words.");
		println("Blank line signals end of program");
		String word = "";
		while(true){
			word = readLine("Enter a word: ");
			if(word.trim().equalsIgnoreCase("")){
				break;
			} else if(isWord(word)){
				println("plural of " + word + " is: " + pluralWord(word));
			} else {
				println("Not a word.");
			}
		}
		println("Blank line. Program ended.");
		
	}
	private String pluralWord(String word){
		String pluralWord = word;
		String wordTrimedY = "";
		if(word.endsWith("s") || word.endsWith("x") ||
			word.endsWith("z") || word.endsWith("ch") || word.endsWith("sh")){
			pluralWord += "es";
		} else if(word.endsWith("y")) {
			wordTrimedY = word.substring(0, word.length() - 1);
			char ch = wordTrimedY.charAt(wordTrimedY.length() - 1);
			if(isEnglishConsonant(ch)){
				pluralWord = wordTrimedY + "ies";
			} else {
				pluralWord += "s";
			}
		} else {
			pluralWord += "s";
		}
		return pluralWord;
	}
	
	private boolean isWord(String word){
		for(int i = 0; i < word.length(); i++){
			char ch = word.charAt(i);
			if(!Character.isLetter(ch)) return false;
		}
		return true;
	}
	private boolean isEnglishConsonant(char ch){
		switch (Character.toLowerCase(ch)) {
			case 'a': case 'e': case 'i': case 'o': case 'u':
				return false;
			default: 
				return true;
		}
	}
}
