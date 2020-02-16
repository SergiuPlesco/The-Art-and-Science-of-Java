/*
 * Math Quiz in base 8
 */
import acm.program.*;
import acm.util.*;
public class MathQuizBase8 extends ConsoleProgram{
	public void run(){
		println("Wlecome to Math Quiz in base 8.");
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
			String sumStr = Integer.toString(sum, 8);
			
				if(sum <= 20){
					int answer = readInt("What is " + a + " + " + b + ": ");
					String answerStr = Integer.toString(answer);
					if(answerStr.equals(sumStr)){
						randomEncouragement();
					} else {
						int i = 2;
						while(!(answerStr.equals(sumStr))){
							answer = readInt("That's incorrect - try a different amswer: ");
							answerStr = Integer.toString(answer);
							i--;
							if(i == 0 && answerStr.equals(sumStr)){
								randomEncouragement();
							} else if(i == 0 && !(answerStr.equals(sumStr))) {
								println("No, the answer is " + sumStr);
								break;
							} else if(answerStr.equals(sumStr)){
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
					String subStr = Integer.toString(sub, 8);
					int answerSub = readInt("What is " + a + " - " + b + ": ");
					String answerStr = Integer.toString(answerSub);
					if(answerStr.equals(subStr)){
						randomEncouragement();
					} else {
						int i = 2;
						while(!(answerStr.equals(subStr))){
							answerSub = readInt("That's incorrect - try a different amswer: ");
							answerStr = Integer.toString(answerSub);
							i--;
							if(i == 0 && answerStr.equals(subStr)){
								randomEncouragement();
							} else if(i == 0 && !(answerStr.equals(subStr))) {
								println("No, the answer is " + subStr);
								break;
							} else if(answerStr.equals(subStr)){
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
