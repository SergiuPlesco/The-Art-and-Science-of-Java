/*
 * A palindrome is a word that reads identically backward and forward, such as 
 * level or noon. Write a predicate method isPalindrome(str) that return true
 * if the string str is a palindrome. In addition, design and write a test program
 * that cals isPalindrome to demonstrate that it works. In writing  the program, concentrate on 
 * how to solve the problem simply rather than how to make your solution more efficient.
 */
import acm.program.*;
public class Palindrome extends ConsoleProgram {
	public void run(){
		String str = readLine("Enter a word to check if it is palindrome: ");
		println(isPalindrome(str));
	}
	private boolean isPalindrome(String str){
		String reverse = "";
		for(int i = str.length()-1;i >= 0;i-- ){
			char ch = str.charAt(i);
			reverse += ch;
			if(str.equals(reverse)){
				return true;
			} 
		}
		return false;
	}
}
