/*
 * Write a method randomWord that returns a randomly constructed "word" 
 * consisting of randomly chosen letters. The number of letters in the word
 * should also be chosen randomly by picking a number between the values of the
 * named constants MIN_LETTERS and MAX_LETTERS. Write a ConsolePorgram that tests
 * your method by displaying five random words.
 */
import acm.program.*;
import acm.util.RandomGenerator;
public class RandomWord extends ConsoleProgram {
	public void run(){
		for(int i = 0; i < 5; i++){
			randomWord();
		}
	}
	private void randomWord(){
		int wordLength = rgen.nextInt(MIN_LETTERS, MAX_LETTERS);
		String word = "";
		for(int i = 0; i <= wordLength; i++){
			char ch = randomLetter();
			word += ch;
		}
		println(word);
	}
	private char randomLetter(){
		return (char) rgen.nextInt('A', 'Z');
	}
	public final static int MIN_LETTERS = 3;
	public final static int MAX_LETTERS = 9;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
