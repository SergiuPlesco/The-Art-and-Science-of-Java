/*
 * Chapter 8, exercise 19, Obenglobish
 */
import acm.program.*;
public class Obenglobish extends ConsoleProgram {
	public void run(){
		String word = readLine("Enter a word: ");
		while(true){
			if(word.equals(" ")) break;
			println(word + " -> " + obenglobish(word));
		}
	}
	private String obenglobish(String word){
		String result = "";
	    for (int i = 0; i < word.length(); i++) {
	        char ch = word.charAt(i);
	        if (isEnglishVowel(ch)) {
	            if (ch == 'e' && i == word.length()-1) {
	                result += ch;
	            } else {
	                if(i != 0 && isEnglishVowel(word.charAt(i-1))) {
	                    result += ch;
	                } else {
	                    result = result + "ob" + ch;
	                }                   
	            }
	        } else {
	            result += ch;
	        } 
	    }
	    return result;
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
	
}
