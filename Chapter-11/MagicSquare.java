/*
 * Chapter 11, exercise 4. Magic Square
 */
import acm.program.*;
import java.util.*;
public class MagicSquare extends ConsoleProgram {
	public void run(){
		 int[][] array = {
			{16,  3,  2, 13},
			{ 5, 10, 11,  8},
			{ 9,  6,  7, 12},
			{ 4, 15, 14,  1},
		};
		if(isMagicSquare(array)){
			println("True");
		} else {
			println("false");
		}
	}
	
	private boolean isMagicSquare(int[][] array){
		//find sum of each row, column and diagonals
		//check if sum of each row, column and diagonals are equal
		//return true if are equal
		
		int diag1 = 0;
		int diag2 = 0;
		//top left to bottom right diagonal
		for(int i = 0; i < N; i++){
			diag1 += array[i][i];

		}
		//bottom left to top right diagonal
		for(int i = 0; i < N; i++){
			diag2 += array[N - 1 - i][i];
		}
		if(diag1 != diag2){
			return false;
		}
		
		
		//check sum	of each row
		for(int row = 0; row < N; row++){
			int rowSum = 0;
			for(int col = 0; col < N; col++){
				//columns and row
					rowSum += array[row][col];
			}
			if(rowSum != diag1){
				return false;
			}
		}
		
		//check sum of every column
		for(int row = 0; row < N; row++){
			int colSum = 0;
			for(int col = 0; col < N; col++){
				colSum += array[col][row];
			}
			if(colSum != diag1){
				return false;
			}
		}
		
		
		println(diag1 + " / " + diag2);
		return true;
	}
	private int N = 4;
}
