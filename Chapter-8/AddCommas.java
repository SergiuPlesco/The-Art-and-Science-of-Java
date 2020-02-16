/*
 * Chapter 8, exercise 13, Add commas
 */
import acm.program.*;
public class AddCommas extends ConsoleProgram {
	public void run(){
		while(true){
			String digits = readLine("Enter a number: ");
			if(digits.length() == 0) break;
			println(addCommas(digits));
		}
	}
	private String addCommas(String digits){
		String reversedNumber = "";
		String number = "";
		/*
		 * count from right to left and creating a inversed di
		 * digits string with commas after every 3 digits
		 */
		for(int i = 0; i < digits.length(); i++){
			char ch = digits.charAt((digits.length()-1) - i);
			if(i % 3 == 0 && i != 0){
				reversedNumber += ',';
			}
			reversedNumber += ch;
		}
		/*
		 * takes the string created in the loop above 
		 * and reverses with commas in correct place
		 */
		for(int i = 0; i < reversedNumber.length(); i++){
			char ch = reversedNumber.charAt((reversedNumber.length()-1) - i);
			number += ch;
		}
		return number;
	}
}
