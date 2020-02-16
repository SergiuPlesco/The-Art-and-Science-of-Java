/*
 * Chapter 8, exercise 10. Create ordinal form method.
 */
import acm.program.*;
public class OrdinalForm extends ConsoleProgram {
	public void run(){
		println("this program creates ordinal numbers.");
		println("This program stops when 0 is read in.");
		int n;
		while(true){
			n = readInt("Enter a cardinal number: ");
			if(n == 0){
				break;
			} else {
				println("The ordinal form of " + n + " is: " + createOrdinalForm(n));
			}
		}
		println("Blank line.");
	}
	private String createOrdinalForm(int n){
		String cardinalForm = Integer.toString(n);
		String ordinalForm = "";

		
		if(cardinalForm.length() == 1){
			if(cardinalForm.equals("1")){
				ordinalForm = cardinalForm + "st";
			} else if(cardinalForm.equals("2")){
				ordinalForm = cardinalForm + "nd";
			} else if(cardinalForm.equals("3")){
				ordinalForm = cardinalForm + "rd";
			} else {
				ordinalForm = cardinalForm + "th";
			}
		}
		if(cardinalForm.length() > 1){
			String trimed = cardinalForm.substring(0, cardinalForm.length() - 1);
			if(cardinalForm.endsWith("1")){
				if(trimed.endsWith("1")){
					ordinalForm = cardinalForm + "th";
				} else {
					ordinalForm = cardinalForm + "st";
				}
			} else if(cardinalForm.endsWith("2")){
				if(trimed.endsWith("1")){
					ordinalForm = cardinalForm + "th";
				} else {
					ordinalForm = cardinalForm + "nd";
				}
			} else if(cardinalForm.endsWith("3")){
				if(trimed.endsWith("1")){
					ordinalForm = cardinalForm + "th";
				} else {
					ordinalForm = cardinalForm + "rd";
				}
			} else {
				ordinalForm = cardinalForm + "th";
			}
		} 
		

		return ordinalForm;
	}
}
