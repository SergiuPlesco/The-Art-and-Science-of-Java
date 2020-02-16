/*
 * Slot machine
 */
import java.awt.event.KeyEvent;

import acm.program.*;
import acm.util.*;
public class SlotMachine extends ConsoleProgram {
	public void run(){
		String needInstructions = readLine("Whould you like instructions?: ");
		if(yesno(needInstructions)){
			println("1. instr one...");
			String readyToPlay = readLine("Ready to play?: ");
			readyToPlay(readyToPlay);
		} else {
			String readyToPlay = readLine("Ready to play?: ");
			readyToPlay(readyToPlay);
		}
	}
		
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
				println("Please answer with Yes or no?");
				String answer = readLine("Would you like instructions: ");
				str = answer;
			}
		}
		return succes;
	}
	
	private boolean readyToPlay(String str){
		boolean succes = yesno(str);
		if(succes){
			game();
		} else {
			println("Bye");
		}
		return succes;
	}
		
	private void game(){
		int moneyToPlay = readInt("How much money you got? ");
		int moneyCounter = moneyToPlay;
		int bet = 1;
		int house = 0;
		if(moneyToPlay > 0){
			while(moneyCounter > 0){
				String play = readLine("Play? ");
				if(yesno(play)){
					int wheel1 = rgen.nextInt(1, 6);
					String symbol1 = "";
					switch(wheel1){
					case 1: symbol1 = "CHERRY"; break;
					case 2: symbol1 = "LEMON"; break;
					case 3: symbol1 = "ORANGE"; break;
					case 4: symbol1 = "PLUM"; break;
					case 5: symbol1 = "BELL"; break;
					case 6: symbol1 = "BAR"; break;
					default: break;
					}
					int wheel2 = rgen.nextInt(1, 6);
					String symbol2 = "";
					switch(wheel2){
					case 1: symbol2 = "CHERRY"; break;
					case 2: symbol2 = "LEMON"; break;
					case 3: symbol2 = "ORANGE"; break;
					case 4: symbol2 = "PLUM"; break;
					case 5: symbol2 = "BELL"; break;
					case 6: symbol2 = "BAR"; break;
					default: break;
					}
					int wheel3 = rgen.nextInt(1, 6);
					String symbol3 = "";
					switch(wheel3){
					case 1: symbol3 = "CHERRY"; break;
					case 2: symbol3 = "LEMON"; break;
					case 3: symbol3 = "ORANGE"; break;
					case 4: symbol3 = "PLUM"; break;
					case 5: symbol3 = "BELL"; break;
					case 6: symbol3 = "BAR"; break;
					default: break;
					}
					
					String pattern = symbol1 + " " + symbol2 + " " + symbol3;
					
					String cherry = "CHERRY";
					String lemon = "LEMON";
					String orange = "ORANGE";
					String plum = "PLUM";
					String bell = "BELL";
					String bar = "BAR";
					
					moneyCounter-=bet;
					house++;
					if(symbol1.equals(bar) && symbol2.equals(bar) && symbol3.equals(bar)){
						winnings = moneyCounter  + win250;
						println(pattern + " you win 250." + " You now have:" + winnings);
					} else if(symbol1.equals(bell) && symbol2.equals(bell) && (symbol3.equals(bell) || symbol3.equals(bar))){
						winnings = moneyCounter  + win20;
						println(pattern + " you win 20." + " You now have:" + winnings);
					} else if(symbol1.equals(plum) && symbol2.equals(plum) && (symbol3.equals(plum) || symbol3.equals(bar))){
						winnings = moneyCounter  + win14;
						println(pattern + " you win 14" + " You now have:" + winnings);
					} else if(symbol1.equals(orange) && symbol2.equals(orange) && (symbol3.equals(orange) || symbol3.equals(bar))){
						winnings = moneyCounter  + win10;
						println(pattern + " you win 10." + " You now have:" + winnings);
					} else if(symbol1.equals(cherry) && symbol2.equals(cherry) && symbol3.equals(cherry)){
						winnings = moneyCounter  + win7;
						println(pattern + " you win 7." + " You now have:" + winnings);
					} else if(symbol1.equals(cherry) && symbol2.equals(cherry)){
						winnings = moneyCounter  + win5;
						println(pattern + " you win 5." + " You now have:" + winnings);
						
					} else if(symbol1.equals(cherry)){
						winnings = moneyCounter  + win2;
						println(pattern + " you win 2." + " You now have:" + winnings);
						
					} else {
						winnings = moneyCounter;
						println(pattern + " you loose 1." + " you now have: " + winnings);
					}
					moneyCounter = winnings;
				} else {
					println("You have: " + winnings);
					println("House: " + house);
					break;
				}
				
			}//end of while loop
			println("thanks for playng.");
			println("You have: " + winnings);
			println("House: " + house);
			
		} else {
			println("Not enough, bye.");
		}//end of if statement
	}//end of game()

	private final int win250 = 250;
	private final int win20 = 20;
	private final int win14 = 14;
	private final int win10 = 10;
	private final int win7 = 7;
	private final int win5 = 5;
	private final int win2 = 2;
	
	private int winnings;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
}
