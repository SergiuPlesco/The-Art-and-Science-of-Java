/*
 * Dewey Defeats Truman
 */

import acm.program.*;
import acm.graphics.*;

public class DeweyDefeatsTruman extends GraphicsProgram {
	public void run(){
		
		runningString();
		
	}
	
	private void runningString(){
		GLabel string = new GLabel("DEWEY DEFEATS TRUMAN");
		
		string.setFont("Helvetica-BOLD-300");
		double stringX = getWidth();
		double stringY = getHeight()/2 + string.getAscent()/2;
		add(string, stringX, stringY);
		
		double dx = -1;
		double dy = 0;
	
		while(true){
			string.move(dx, dy);
			pause(TIME_PAUSE);
			if(string.getX() ==  - string.getWidth()){//if true sets string at the start and repeats loop
				add(string, stringX, stringY);
			}
		}
	
	}
	private static final int TIME_PAUSE = 10;
}
