/*
 * Implement readInt prompt using readLine prompt
 * Transform string to integer
 */
import acm.program.*;
public class Add2Integers extends ConsoleProgram {
	public void run(){
		int num1 = myReadInt("Enter num1: ");
		int num2 = myReadInt("Enter num2: ");
		int sum = num1 + num2;
		println(num1 + " + " + num2 + " = " + sum);
	}
	private int myReadInt(String prompt){
		int no;
		while(true){
			String str = readLine(prompt);
			String checkedStr = "";
			
			for(int i = 0; i < str.length(); i++){
				char ch = str.charAt(i);
				
				if(ch == '-' || Character.isDigit(ch)){
					checkedStr += ch;
				} 
			}
			if(checkedStr.equals(str)){
				no = Integer.parseInt(checkedStr);
				break;
			} else {
				println("Error Illegal Number Format.");
			}
		}
		return no;
	}
}
