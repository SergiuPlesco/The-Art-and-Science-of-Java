/*
 * Math Quiz
 */
import acm.program.*;
import acm.util.*;
public class MathQuiz extends ConsoleProgram{
	public void run(){
		println("Wlecome to Math Quiz");
		int timesAsked = 0;
		while(timesAsked < NUMBER_OF_QUESTIONS){
			askQuestion();
			timesAsked++;
		}
	}
	private int addition() {
		int some = 0;
		while(true){
			int a = rgen.nextInt(20);
			int b = rgen.nextInt(20);
			
			int sum = a + b;
			
				if(sum <= 20){
					int answer = readInt("What is " + a + " + " + b + ": ");
					if(answer == sum){
						randomEncouragement();
					} else {
						int i = 2;
						while(answer != sum){
							answer = readInt("That's incorrect - try a different amswer: ");
							i--;
							if(i == 0 && answer == sum){
								randomEncouragement();
							} else if(i == 0 && answer != sum) {
								println("No, the answer is " + sum);
								break;
							} else if(answer == sum){
								randomEncouragement();
							}
						}
					}
					break;
				}
		}
		return some;
	}
	
	private int subtraction() {
		int some = 0;
		while(true){
			int a = rgen.nextInt(20);
			int b = rgen.nextInt(20);
			int sub = a - b;
			
				if(a >= b) {
					int answer = readInt("What is " + a + " - " + b + ": ");
					if(answer == sub){
						randomEncouragement();
					} else {
						int i = 2;
						while(answer != sub){
							answer = readInt("That's incorrect - try a different amswer: ");
							i--;
							if(i == 0 && answer == sub){
								randomEncouragement();
							} else if(i == 0 && answer != sub) {
								println("No, the answer is " + sub);
								break;
							} else if(answer == sub){
								randomEncouragement();
							}
						}
					}	
					break;
				}
		}
		return some;
	}
	
	private int askQuestion(){
		int askQuestion = rgen.nextBoolean() ? addition() : subtraction();
		return askQuestion;
	}
	
	private void randomEncouragement(){
		int randomNumber = rgen.nextInt(4);
		
		switch(randomNumber){
		case 0: println("Correct!"); break;
		case 1: println("That's the answer!"); break;
		case 2: println("You got it!"); break;
		case 3: println("Well done!"); break;
		case 4: println("Very good!"); break;
		default: break;
		}
	}
	
	private static final int  NUMBER_OF_QUESTIONS = 5;
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
