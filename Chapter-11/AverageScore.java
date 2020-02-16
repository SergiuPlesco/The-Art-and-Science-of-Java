/*
 * Chapter 11, exercise 1 
 */
import acm.program.*;
import java.util.*;
public class AverageScore extends ConsoleProgram {
	public void run(){
		println("This program computes the average of the five scores.");
		ArrayList<Double> scoreList = readScores();
		discardHighestLowest(scoreList);
		computeAverageOfFive(scoreList);
//		printAverage();
	}
	private ArrayList<Double> readScores(){
		ArrayList<Double> scoreList = new ArrayList<Double>();
		for(int i = 0; i < NJUDGES; i++){
			double score = readDouble("What is the score?: ");
			scoreList.add(score);
		}
		return scoreList;
	}
	
	/* Discard highest and lowest scores and return  */
	private void discardHighestLowest(ArrayList scoreList){
		double max = (Double) scoreList.get(0);
		double min = (Double) scoreList.get(0);
		for(int i = 0; i < scoreList.size(); i++){
			if((Double)scoreList.get(i) > max){
				max = (Double)scoreList.get(i);
			} else if((Double)scoreList.get(i) < min){
				min = (Double)scoreList.get(i);
			}
			
		}
		scoreList.remove(max);
		scoreList.remove(min);
		println("max score is: " + max);
		println("min score is: " + min);
		println(scoreList);
		
	}
	
	/* computeAverageOfFive(scoreList) */
	private void computeAverageOfFive(ArrayList scoreList){
		double total = 0;
		
		for(int i = 0; i< scoreList.size(); i++){
			total += (Double) scoreList.get(i);
		} 
		double average = total / scoreList.size();
		println("Average score is: " + average);
	}
	
	private static final int NJUDGES = 7;
}
