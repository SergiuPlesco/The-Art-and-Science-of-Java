/*
 * Chpter 12, exercise 11
 */
import acm.program.*;
import java.io.*;
import java.util.*;
public class WordCount extends ConsoleProgram {
	public void run(){

		BufferedReader rd = null;
		try {
			rd = new BufferedReader(new FileReader("Lear.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			println("Can;t open");
		}
		Scanner scanner = new Scanner(rd);

		int nLines = 0;
		int nWords = 0;
		int nCharacters = 0;
		
		while(scanner.hasNextLine()){
			String line = scanner.nextLine();
			println(line);
			nLines++;
			
			//characters in one line
			nCharacters += line.length();
			
			//creates an array of words from a line
			String[] wordList = line.split(" ");
			
			//adds the length as number of words
			nWords += wordList.length;

		}
	
		println("Lines: " + nLines);
		println("Words: " + nWords);
		println("Characters: " + nCharacters);
		scanner.close();
	}
}
