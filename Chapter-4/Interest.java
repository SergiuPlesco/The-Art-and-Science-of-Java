/*
 * This program calculates interest rate after one year
 */
import acm.program.*;
public class Interest extends ConsoleProgram{
public void run() {
	println("Interest calculation program.");
	int balance = readInt("Enter starting balance: ");
	double interest = readDouble("Enter annual interest rate: ");
	
	/*
	 * Formula to calculate balance after one year with given interest rate.
	 */
	double balanceAfterOneYear = ((interest/100) * balance) + balance;
	
	/*
	 * Formula to calculate balance after two years with given interest rate.
	 */
	double balanceAfterTwoYears = ((interest/100) * balanceAfterOneYear) + balanceAfterOneYear;
	
	println("Balance after one year = " + balanceAfterOneYear);
	println("Balance after two years = " + balanceAfterTwoYears);
}
}
