/*
 * File: SlotMachineGraphics.java
 * ------------------------------
 * This file defines a Graphics class that is slot machine program
 */
import acm.graphics.*;
import acm.program.*;
import acm.util.*;
public class SlotMachineGraphics extends GraphicsProgram {
	public void run(){
		
		game();
		
	}
	

	private void game(){
		
		GImage slot1 = new GImage("Images/Play.png");
		double xSlot1 = getWidth() / 2 - slot1.getWidth() * 2;
		double ySlot1 = (getHeight() - slot1.getHeight()) / 2;
		
		GImage slot2 = new GImage("Images/Play.png");
		double xSlot2 = (getWidth() - slot2.getWidth()) / 2;
		double ySlot2 = (getHeight() - slot2.getHeight()) / 2;
		
		GImage slot3 = new GImage("Images/Play.png");
		double xSlot3 = getWidth() / 2 + slot3.getWidth();
		double ySlot3 = (getHeight() - slot3.getHeight()) / 2;
		
		add(slot1, xSlot1, ySlot1);
		add(slot2, xSlot2, ySlot2);
		add(slot3, xSlot3, ySlot3);
		
		GLabel welcome = new GLabel("Welcome to the slot machine!");
		welcome.setFont("Arial-bold-18");
		GLabel money = new GLabel("You now have " + MONEY_TO_PLAY + ".");
		money.setFont("Arial-bold-18");
		GLabel play = new GLabel("Click to play.");
		play.setFont("Arial-bold-18");
		
		add(welcome, xSlot1, getHeight() / 2 + slot1.getHeight());
		add(money, xSlot1, getHeight() / 2 + slot1.getHeight() + money.getHeight());
		add(play, xSlot1, getHeight() / 2 + slot1.getHeight() + money.getHeight() * 2);
		
		/////////////////////////////////////////////////
		
		
		
		GLabel score = new GLabel("");
		add(score, 100, 30);
		
		GLabel win = new GLabel("");
		add(win, 0, 0);
		int moneyToPlay = MONEY_TO_PLAY;
		int moneyCounter = moneyToPlay;
		int bet = 1;
		int house = 0;
		if(moneyToPlay > 0){
			while(moneyCounter > 0){
				waitForClick();
				
					int wheel1 = rgen.nextInt(1, 6);
					String symbol1 = "";
					switch(wheel1){
					case 1: symbol1 = "Cherry.png"; break;
					case 2: symbol1 = "Lemon.png"; break;
					case 3: symbol1 = "Orange.png"; break;
					case 4: symbol1 = "Plum.png"; break;
					case 5: symbol1 = "Bell.png"; break;
					case 6: symbol1 = "Bar.png"; break;
					default: break;
					}
					int wheel2 = rgen.nextInt(1, 6);
					String symbol2 = "";
					switch(wheel2){
					case 1: symbol2 = "Cherry.png"; break;
					case 2: symbol2 = "Lemon.png"; break;
					case 3: symbol2 = "Orange.png"; break;
					case 4: symbol2 = "Plum.png"; break;
					case 5: symbol2 = "Bell.png"; break;
					case 6: symbol2 = "Bar.png"; break;
					default: break;
					}
					int wheel3 = rgen.nextInt(1, 6);
					String symbol3 = "";
					switch(wheel3){
					case 1: symbol3 = "Cherry.png"; break;
					case 2: symbol3 = "Lemon.png"; break;
					case 3: symbol3 = "Orange.png"; break;
					case 4: symbol3 = "Plum.png"; break;
					case 5: symbol3 = "Bell.png"; break;
					case 6: symbol3 = "Bar.png"; break;
					default: break;
					}
					

					GImage image1 = new GImage(symbol1);
					GImage image2 = new GImage(symbol2);
					GImage image3 = new GImage(symbol3);
					
					remove(score);
					remove(welcome);
					remove(win);
					remove(money);
					
					String cherry = "Cherry.png";
					String lemon = "Lemon.png";
					String orange = "Ornage.png";
					String plum = "Plum.png";
					String bell = "Bell.png";
					String bar = "Bar.png";
					
					moneyCounter-=bet;
					house++;
					if(symbol1.equals(bar) && symbol2.equals(bar) && symbol3.equals(bar)){
						winnings = moneyCounter  + win250;
						add(image1, getWidth() / 2 - image1.getWidth() * 2, (getHeight() - image1.getHeight()) / 2);
						add(image2, (getWidth() - image2.getWidth()) / 2, (getHeight() - image2.getHeight()) / 2);
						add(image3, getWidth() / 2 + image3.getWidth(), (getHeight() - image3.getHeight()) / 2);
						
						win = new GLabel("You win 250." + win250);
						add(win, xSlot1, getHeight() / 2 + slot1.getHeight());
						score = new GLabel(" You now have:" + winnings);
						add(score, xSlot1, getHeight() / 2 + slot1.getHeight() + money.getHeight());
						
					} else if(symbol1.equals(bell) && symbol2.equals(bell) && (symbol3.equals(bell) || symbol3.equals(bar))){
						winnings = moneyCounter  + win20;
						add(image1, getWidth() / 2 - image1.getWidth() * 2, (getHeight() - image1.getHeight()) / 2);
						add(image2, (getWidth() - image2.getWidth()) / 2, (getHeight() - image2.getHeight()) / 2);
						add(image3, getWidth() / 2 + image3.getWidth(), (getHeight() - image3.getHeight()) / 2);
						
						win = new GLabel("You win " + win20);
						add(win, xSlot1, getHeight() / 2 + slot1.getHeight());
						score = new GLabel("You now have:" + winnings);
						add(score, xSlot1, getHeight() / 2 + slot1.getHeight() + money.getHeight());
						
					} else if(symbol1.equals(plum) && symbol2.equals(plum) && (symbol3.equals(plum) || symbol3.equals(bar))){
						winnings = moneyCounter  + win14;
						add(image1, getWidth() / 2 - image1.getWidth() * 2, (getHeight() - image1.getHeight()) / 2);
						add(image2, (getWidth() - image2.getWidth()) / 2, (getHeight() - image2.getHeight()) / 2);
						add(image3, getWidth() / 2 + image3.getWidth(), (getHeight() - image3.getHeight()) / 2);
						
						win = new GLabel("You win " + win14);
						add(win, xSlot1, getHeight() / 2 + slot1.getHeight());
						score = new GLabel("You now have:" + winnings);
						add(score, xSlot1, getHeight() / 2 + slot1.getHeight() + money.getHeight());
						
					} else if(symbol1.equals(orange) && symbol2.equals(orange) && (symbol3.equals(orange) || symbol3.equals(bar))){
						winnings = moneyCounter  + win10;
						add(image1, getWidth() / 2 - image1.getWidth() * 2, (getHeight() - image1.getHeight()) / 2);
						add(image2, (getWidth() - image2.getWidth()) / 2, (getHeight() - image2.getHeight()) / 2);
						add(image3, getWidth() / 2 + image3.getWidth(), (getHeight() - image3.getHeight()) / 2);
						
						win = new GLabel("You win " + win10);
						add(win, xSlot1, getHeight() / 2 + slot1.getHeight());
						score = new GLabel("You now have:" + winnings);
						add(score, xSlot1, getHeight() / 2 + slot1.getHeight() + money.getHeight());
						
					} else if(symbol1.equals(cherry) && symbol2.equals(cherry) && symbol3.equals(cherry)){
						winnings = moneyCounter  + win7;
						add(image1, getWidth() / 2 - image1.getWidth() * 2, (getHeight() - image1.getHeight()) / 2);
						add(image2, (getWidth() - image2.getWidth()) / 2, (getHeight() - image2.getHeight()) / 2);
						add(image3, getWidth() / 2 + image3.getWidth(), (getHeight() - image3.getHeight()) / 2);
						
						win = new GLabel("You win " + win7);
						add(win, xSlot1, getHeight() / 2 + slot1.getHeight());
						score = new GLabel("You now have:" + winnings);
						add(score, xSlot1, getHeight() / 2 + slot1.getHeight() + money.getHeight());
						
					} else if(symbol1.equals(cherry) && symbol2.equals(cherry)){
						winnings = moneyCounter  + win5;
						
						add(image1, getWidth() / 2 - image1.getWidth() * 2, (getHeight() - image1.getHeight()) / 2);
						add(image2, (getWidth() - image2.getWidth()) / 2, (getHeight() - image2.getHeight()) / 2);
						add(image3, getWidth() / 2 + image3.getWidth(), (getHeight() - image3.getHeight()) / 2);
						
						win = new GLabel("You win " + win5);
						add(win, xSlot1, getHeight() / 2 + slot1.getHeight());
						score = new GLabel("You now have:" + winnings);
						add(score, xSlot1, getHeight() / 2 + slot1.getHeight() + money.getHeight());
						
					} else if(symbol1.equals(cherry)){
						winnings = moneyCounter  + win2;
						
						add(image1, getWidth() / 2 - image1.getWidth() * 2, (getHeight() - image1.getHeight()) / 2);
						add(image2, (getWidth() - image2.getWidth()) / 2, (getHeight() - image2.getHeight()) / 2);
						add(image3, getWidth() / 2 + image3.getWidth(), (getHeight() - image3.getHeight()) / 2);
						
						win = new GLabel("You win " + win2);
						add(win, xSlot1, getHeight() / 2 + slot1.getHeight());
						score = new GLabel("You now have:" + winnings);
						add(score, xSlot1, getHeight() / 2 + slot1.getHeight() + money.getHeight());
						
					} else {
						winnings = moneyCounter;
						
						add(image1, getWidth() / 2 - image1.getWidth() * 2, (getHeight() - image1.getHeight()) / 2);
						add(image2, (getWidth() - image2.getWidth()) / 2, (getHeight() - image2.getHeight()) / 2);
						add(image3, getWidth() / 2 + image3.getWidth(), (getHeight() - image3.getHeight()) / 2);
						
						win = new GLabel("You loose: " + bet);
						add(win, xSlot1, getHeight() / 2 + slot1.getHeight());
						score = new GLabel("You now have: " + winnings);
						add(score, xSlot1, getHeight() / 2 + slot1.getHeight() + money.getHeight());
					
					}
					moneyCounter = winnings;
				
				
			}//end of while loop
			remove(score);
			GLabel thanks = new GLabel("Thanks for playing.");
			GLabel you = new GLabel("You have: " + winnings);
			GLabel houseResult = new GLabel("House: " + house);
			add(thanks, 100, 30);
			add(you, 100, 50);
			add(houseResult, 100, 70);
			
		} else {
			println("Not enough, bye.");
		}//end of if statement
	}//end of game()
	
	
	/* Instance variables, constants */
	private static final int MONEY_TO_PLAY = 10;
	
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
