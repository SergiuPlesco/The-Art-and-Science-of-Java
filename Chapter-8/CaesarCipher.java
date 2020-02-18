/*
 * Chapter 8, exercise 11, CaesarCipher
 */
import java.util.StringTokenizer;

import acm.program.*;
public class CaesarCipher extends ConsoleProgram {
	public void run(){
		println("This program encodes a string by shifting letters forward or backward in the alphabet.");
		String str = "This is a secret message.";
		int shift = -5;
		
		println(encodeToken(str, shift));
	}
	private String encodeToken(String str, int shift){
		String result = "";
		StringTokenizer tokenizer = new StringTokenizer(str, DELIMITERS, true);
		while(tokenizer.hasMoreTokens()){
			String token = tokenizer.nextToken();
			if(isWord(token)){
				token = encodeWord(token, shift);
			}
			result += token;
		}
		return result;
	}
	
	private boolean isWord(String token){
		for(int i = 0; i < token.length(); i++){
			char ch = token.charAt(i);
			if(!Character.isLetter(ch)) return false;
		}
		return true;
	}
	private String encodeWord(String word, int shift){
		String newWord = "";
		for(int j = 0; j < word.length(); j++){
			char ch = word.charAt(j);
			
			if(Character.isUpperCase(ch)){
				ch += shift;
				if(ch < 'A') ch += 26;
				if(ch > 'Z') ch -= 26;
				newWord += ch;
			} else {
				ch += shift;
				if(ch < 'a') ch += 26;
				if(ch > 'z') ch -= 26;
				newWord += ch;
			}
		}
		return newWord;
	}
	private static final String DELIMITERS = "!@#$%^&*()_-+={[}]:;\"'<,>.?/~`|\\1234567890 ";
}
