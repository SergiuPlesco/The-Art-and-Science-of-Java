/*
 * Implement a method isEnglishConsonant(ch). which returns true if ch is a consonant in English.
 */
import acm.program.*;

public class EnglishConsonant extends ConsoleProgram {
	public void run(){
		println("This program check if ch Enlgish consonants and return true or false.");
		String consonants = "";
		for(char i = 'A'; i <= 'Z';i++){
			if(isEnglishConsonant(i)){
				consonants += i;
			}
		}
		println(consonants);
		
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
