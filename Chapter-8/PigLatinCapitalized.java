/*
 * Chapter 8, exercise 18, Pig Latin program
 * capitalize first letters
 */
import acm.program.*;
import java.util.*;
public class PigLatinCapitalized extends ConsoleProgram {
	public void run(){
		println("This program translates a line into Pig Latin");
		String line = "This is Pig Latin.";
		println(translateLine(line));
	}
	
	/*Translate a line to Pig Latin, word by word*/
	private String translateLine(String line){
		String result = "";
		StringTokenizer tokenizer = new StringTokenizer(line, DELIMITERS, true);
		while(tokenizer.hasMoreTokens()){
			String token = tokenizer.nextToken();
			if(isWord(token)){
				token = translateWord(token);
			}
			result += token;
		}
		return result;
	}
	
	/* Translate a word to Pig Latin and return the translated word */
	private String translateWord(String word){
		String pigWord = "";
		String pigWordCaps = "";
		int vp = findFirstVowel(word);// vp means vowel position
		if(vp == -1){
			return word;
		} else if(vp == 0){
			pigWord = word + "way";
			pigWordCaps = pigWord.substring(0, 1).toUpperCase() + pigWord.substring(1).toLowerCase();
			return pigWordCaps;
		} else {
			String head = word.substring(0, vp);
			String tail = word.substring(vp);
			pigWord = tail + head + "ay";
			pigWordCaps = pigWord.substring(0, 1).toUpperCase() + pigWord.substring(1).toLowerCase();
			return pigWordCaps;
		}
	}
	/* Returns the index of the first vowel in the word (-1 if none) */
	private int findFirstVowel(String word){
		for(int i = 0; i < word.length(); i++){
			if(isEnglishVowel(word.charAt(i))) return i;
		}
		return -1;
	}
	/* Returns true if the character is a vowel */
	private boolean isEnglishVowel(char ch){
		switch (Character.toLowerCase(ch)){
		case 'a': case 'e': case 'i': case 'o': case 'u':
			return true;
		default: 
			return false;
		}
	}
	
	/* Returns true if token is a "word" (all characters are letters) */
	private boolean isWord(String token){
		for(int i = 0; i <token.length(); i++){
			char ch = token.charAt(i);
			if(!Character.isLetter(ch)) return false;
		}
		return true;
	}
	
	/* Defines the characters that delimit a token */
	private static final String DELIMITERS = "!@#$%^&*()_-+={[}]:;\"'<,>.?/~`|\\ ";
}
