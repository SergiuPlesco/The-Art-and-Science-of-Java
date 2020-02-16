/*
 * This program calculates and displays the sum of first N odd integers
 */
import acm.program.*;
public class SumOfOddIntegers extends ConsoleProgram{
	public void run() {
		int N = readInt("Enter positive number: ");
		int total = 0;//initialization of variable to display the result
		for(int i = 1; i < N*2; i+=2){//loop to iterate through odd integers
			/*
			 * N*2 is for doubling the path needed to count odd integers
			 * if N = 4, it will count till 8
			 */
			println(i);//prints odd integers
			total += i;//sum of odd integers one by one to the total
		}
		println("Sum of first " + N + " odd integers is: " + total + ".");
	}
}
