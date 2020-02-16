/*
 * Present participle. Chapter 8, programming exercise 9.
 * The art and science of Java by Eric Roberts.
 */
import acm.program.*;
public class PresentParticiple extends ConsoleProgram {
	public void run(){
		println("This program creates present participle.");
		println("Entering a blank line signals the end of this program.");
		String word = "";
		while(true){
			word = readLine("Enter a word: ");
			if(word.trim().equalsIgnoreCase("")){
				break;
			} else if(isWord(word)){
				println(createPresentParticiple(word));
			} else {
				println("Not a word.");
			}
		}
		println("Blank line. Program ended.");
	}
	private String createPresentParticiple(String word){
		String presentParticiple = word;
		String trimedEndE = "";
		char lastCh = word.charAt(word.length() - 1);
		char secondLastCh = word.charAt(word.length() - 2);
		if(word.endsWith("e") && word.length() > 2){
			trimedEndE = word.substring(0, word.length() - 1);
			char ch = trimedEndE.charAt(trimedEndE.length() - 1);
			if(isEnglishConsonant(ch)){
				presentParticiple = trimedEndE + "ing";
			} else {
				presentParticiple += "ing";
			}
		} else if(isEnglishConsonant(lastCh)){
			if(!(isEnglishConsonant(secondLastCh))){
				presentParticiple = word + lastCh + "ing";
			} else {
				presentParticiple += "ing";
			}
		} else {
			presentParticiple += "ing";
		}
		
		return presentParticiple;
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
