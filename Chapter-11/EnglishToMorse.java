/*
 * Chapter 11, exercise 8
 * Translate each letter in the string into its equivalent in Morse code.
 */
import acm.program.*;
import java.util.*;
public class EnglishToMorse extends ConsoleProgram {
	public void run(){
		/*
		 * read in the string from the user
		 * create Morse code 
		 * translate string into Morse Code
		 * print translated string
		 */
		
		String str = readLine("Enter a string to translate: ");
		translateToMorse(str);
		
	}
	private void translateToMorse(String str){
		//english alphabet
		char[] english = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 
			     'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 
			     'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
		//morse code (alphabet)
	    String[] morse = {"\n", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
			          ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", 
			          ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
			          "-....", "--...", "---..", "----.", "-----"};
	    
	    String translated = "";
	    
	    for(int i = 0; i < str.length(); i++){
	    		for(int j = 0; j < english.length; j++){
					if(english[j] == str.toLowerCase().charAt(i)){
							translated += morse[j] + " ";
			    		} 
				}
	    }
	    println(translated);
	    
	}
}
