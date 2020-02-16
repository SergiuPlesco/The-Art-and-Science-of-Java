/*
 * ask yes-no question with prompt as argument to the method 
 * to return true if answer is yes and false if answer is no, if something else 
 * suggest that the answer should be yes or no
 * and ask again.
 */
import acm.program.*;
public class AskYesNoQuestion_prompt extends ConsoleProgram{
	
	public void run(){
		String answer = readLine("Would you like instructions: ");
		
		if(yesno(answer)){
			println("true");
		} else {
			println("false");
		} 
	}
	
	/* Predicate method using boolean method that returns true or false */
	private boolean yesno(String str){
		boolean succes = true;
		while(true){
			if(str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("y")){
				succes = true;
				break;
			} else if(str.equalsIgnoreCase("no") || str.equalsIgnoreCase("n")){
				succes = false;
				break;
			} else {
				println("PLease answer with Yes or no?");
				String answer = readLine("Would you like instructions: ");
				str = answer;
			}
		}
		return succes;
	}
	/* Predicate method using void method that displays/prints true or false */
//	private void yesno(String str){
//		while(true){
//			if(str.equalsIgnorCase("yes")){
//				println("true");
//				break;
//			} else if(str.equalsIgnoreCase("no")){
//				println("false");
//				break;
//			} else {
//				println("PLease answer with Yes or no?");
//				String answer = readLine("Would you like instructions: ");
//				str = answer;
//			}
//		}	
//	}
}
