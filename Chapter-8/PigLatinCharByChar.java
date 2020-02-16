/*
 * Chapter 8, exercise 17, Pig Latin character by character
 * 
 */
import acm.program.*;
import java.util.*;
public class PigLatinCharByChar extends ConsoleProgram {
	public void run(){
		println("This program translates a line into Pig Latin.");
		String line = "This is Pig Latin ";
		println(translateLine(line));
	}
	private String translateLine(String line){
		String result = "";
		String word = "";
		String pigWord = "";

		for(int i = 0, //start of word
				j = 0; //end of word
				i < line.length(); //make sure we're in bounds
				i = j + 1){ //start from were we left off plus 1 to get rid of space we just found
			j = line.indexOf(' ', i); //find the next space
			if(j == -1) break; //-1 means no more spaces so we're done
			
			word = line.substring(i, j);
			pigWord = translateWord(word);

			result += pigWord + " ";
		}
		
		return result;
	}
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
	
	
	private int findFirstVowel(String word){
		for(int i = 0; i < word.length(); i++){
			if(isEnglishVowel(word.charAt(i))) return i;
		}
		return -1;
	}
	private boolean isEnglishVowel(char ch){
		switch (Character.toLowerCase(ch)){
		case 'a': case 'e': case 'i': case 'o': case 'u':
			return true;
		default:
			return false;
		}
	}
}
