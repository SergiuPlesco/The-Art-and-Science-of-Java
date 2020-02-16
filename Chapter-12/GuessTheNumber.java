/*
 * Chapter 12, exercise 1, Guess The number
 * 
 */
import acm.program.*;
public class GuessTheNumber extends ConsoleProgram {
	public void run(){

		guessTheNumber();
		
	}
	private void guessTheNumber(){
		println("Think of a number between 1 and 100");
		
		int lh = 1;
		int lr = 100;
		while(true){
			int mid = (lh + (lr - 1)) / 2;
			String answer = readLine("Is it " + mid + " : ");
			if(answer.equals("y")){
				println("I guessed the number!");
				break;
			} else if(answer.equals("n")){
				String check = readLine("Is it less then " + mid + " : ");
					if(check.equals("y")){
						lr = mid;
					} else if(check.equals("n")){
						lh = mid + 1;
					}
			}
		}
	}
}
