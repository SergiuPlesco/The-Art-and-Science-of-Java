/*
 * This program reads in a list of integers
 * then prints out the average.
 */
import acm.program.*;
public class AverageListBlankLine extends ConsoleProgram {
	public void run(){
		println("This program reads in a list of integers");
		println("and prints out the average, using null");
		println("to signal the end of program.");
		
		int total = 0;
		int avrg = 0;
		int result = 0;
		
		while(true){
			String score = readLine("Enter score: ");
			if( score == null || score.trim().equalsIgnoreCase("")){
				println("You entered nothing and the program stopped.");
				break;
			} else {
				int scoreToInt = Integer.parseInt(score);
				avrg++;//increment by how many times user reads in integers
				total += scoreToInt;
				result = total / avrg; //average calculation
			}
		}
		println("The average of entered numbers is: " + result);
	}
	
	
	
}
