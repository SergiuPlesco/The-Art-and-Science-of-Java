/*
 * Scrabble word
 */
import acm.program.*;
public class ScrabbleWord extends ConsoleProgram {
	public void run(){
		String str = readLine("Enter a word: ");
		scrabbleWord(str);
		
	}
	private void scrabbleWord(String str){
		String one = "AEILNORSTU";
		String two = "DG";
		String three = "BCMP";
		String four = "FHVWY";
		String five = "K";
		String eight = "JX";
		String ten = "QZ";
		int score = 0;
		for(int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			// one
			for(int j = 0; j < one.length(); j++){
				if(ch == one.charAt(j)){
					score += 1;
				} else {
					score += 0;
				}
			}
			// two
			for(int j = 0; j < two.length(); j++){
				if(ch == two.charAt(j)){
					score += 2;
				} else {
					score += 0;
				}
			}
			// three
			for(int j = 0; j < three.length(); j++){
				if(ch == three.charAt(j)){
					score += 3;
				} else {
					score += 0;
				}
			}
			// four
			for(int j = 0; j < four.length(); j++){
				if(ch == four.charAt(j)){
					score += 4;
				} else {
					score += 0;
				}
			}
			// five
			for(int j = 0; j < five.length(); j++){
				if(ch == five.charAt(j)){
					score += 5;
				} else {
					score += 0;
				}
			}
			// eight
			for(int j = 0; j < eight.length(); j++){
				if(ch == eight.charAt(j)){
					score += 8;
				} else {
					score += 0;
				}
			}
			// ten
			for(int j = 0; j < ten.length(); j++){
				if(ch == ten.charAt(j)){
					score += 10;
				} else {
					score += 0;
				}
			}
		}
		println(str + " has " + score + " point" + (score > 1 ? "s" : ""));
	}
	
}
