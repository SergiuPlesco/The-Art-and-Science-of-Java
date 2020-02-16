/*
 * Use the static methods Integer.parseint and Integer.toString to write
 * a program that converts hexadecimal values into their deciaml equivalent. 
 * Your program should continue to read hexacecimal values until the user
 * enters a 0. 
 */
import acm.program.*;

public class HexToDecimalConverter extends ConsoleProgram {
	public void run(){
		println("This program converts hexadecimal to decimal until 0 is entered.");
		println("Enter 0 to stop.");
		
		while(true){
			String hex = readLine("Enter a hexadecimal number: ").toUpperCase();
			int dec = Integer.parseInt(hex, 16);
			if(dec == 0)break;
			println(hex + " hex = " + dec + " decimal.");
		}
		println("You entered 0 and the programm stopped.");
		
	}

	private static final int SENTINEL = 0;
}
