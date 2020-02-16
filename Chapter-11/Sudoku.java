/*
 * Chapter 11, exercise 5
 */
import acm.program.*;
import java.util.*;
public class Sudoku extends ConsoleProgram {
	public void run(){
		 int[][] array = {
					{16,  3,  2, 13, 17},
					{ 5, 10, 11,  8, 18},
					{ 9,  6,  7, 12, 19},
					{ 4, 15, 14,  1, 20},
					{ 25, 24, 23,  22, 21},
				};
				if(checkSudokuSolution(array)){
					println("True");
				} else {
					println("False");
				}
	}
	
	private boolean checkSudokuSolution(int[][] array){
		//row checker
		for(int row = 0; row < 5; row++){
			 for(int col = 0; col < 5; col++){
				 for(int col2 = col + 1; col2 < 5; col2++){
					 if(array[row][col]==array[row][col2]){
						  return false;
					 }
				 }
			 }
		}
			  
//		//column checker
		for(int col = 0; col < 5; col++){
			for(int row = 0; row < 5; row++){
				 for(int row2 = row + 1; row2 < 5; row2++){
					 if(array[row][col]==array[row2][col]){
						  return false;
					 }
				 }
			}
		}
		
		return true;
	}
	
	private int N = 4;//grid NxN
}
