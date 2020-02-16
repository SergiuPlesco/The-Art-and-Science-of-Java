/*
 * Chapter 11, exercise 2 and 3
 * This program computes the mean (average) of an array.
 * and after that calculates the standard deviation
 */
import acm.program.*;
import java.util.*;
public class GymnasticsJudge extends ConsoleProgram {
	public void run(){
		int nJudges = readInt("Enter number of judges: ");
		scores = new double[nJudges];
		readArray(scores);
		mean(scores);
		standardDeviation(scores);
	}
	
	private void readArray(double[] scores){
		for(int i = 0; i < scores.length; i++){
			scores[i] = readDouble("Score for judge " + i + ": ");
			
		}
	}
	private double mean(double[] scores){
		double total = 0;
		
		for(int i = 0; i < scores.length; i++){
			total += scores[i];
		}
		
		double average = total / scores.length;
//		println("The mean of the array is: " + average);
		return average;
	}
	
	private void standardDeviation(double[] scores){
		double total = 0;
		for(int i = 0; i < scores.length; i++){
			total += Math.pow(scores[i] - (mean(scores)), 2);
		}
		double dev = Math.sqrt(total / scores.length);
		println("Standard deviation is: " + dev);
	}
	
	/**/
	private double[] scores;
}
