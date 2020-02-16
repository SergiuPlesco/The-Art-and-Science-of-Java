/*
 * Checkerboard
 */
import acm.program.*;
import acm.graphics.*;

import java.awt.*;
public class Checkerboard extends GraphicsProgram {
	public void run(){
		double sqSize = (double) getHeight() / N_ROWS;
		double ovSize = (double) sqSize - 10;
		
		//2 nested for loops to draw checker-board
		//sqx is calculated to draw the board in the center of the window
		for(int row = 0; row < N_ROWS; row++){
			for(int col = 0; col < N_COLUMNS; col++){
				double sqx = (col * sqSize) + ((getWidth() / 2) - ((sqSize * 8) / 2));
				double sqy = row * sqSize;
				GRect sq = new GRect(sqx, sqy, sqSize, sqSize);
				sq.setFilled((row + col) % 2 != 0);
				sq.setColor(Color.GRAY);
				add(sq);
			}
		}
		
		//2 nested for loops to draw red circles at the top
		//ovx and ovy are calculated to draq the checkers in the center of the square
		for(int col = 0; col < 8; col++){//8 is 8 columns
			for(int row = 0; row < 3; row++){//3 - numbers of rows 
				if((col + row) % 2 != 0){//if not 0 skip adding GRect
				double ovx = ((col * sqSize) + ((getWidth() / 2) - ((sqSize * 8) / 2)) + sqSize / 2) - ovSize / 2;
				double ovy = ((row * sqSize) + sqSize / 2) - ovSize / 2;
				GOval ov = new GOval(ovx, ovy, ovSize, ovSize);
				ov.setFilled(true);
				ov.setColor(Color.RED);
				add(ov);
				}
			}
		}
		
		//2 nested for loops to draw black circles at the bottom
		//ovy is calculated adding sqSizq * 5 to start from 6th row
		for(int col = 0; col < 8; col++){// 8 - columns
			for(int row = 0; row < 3; row++){//3 - rows
				if((col + row) % 2 == 0){//if 0 add GRect
				double ovx = (((col * sqSize) + ((getWidth() / 2) - ((sqSize * 8) / 2)) + sqSize / 2) - ovSize / 2);
				double ovy = (((row * sqSize) + sqSize / 2) - ovSize / 2)  + (sqSize * 5);
				GOval ov = new GOval(ovx, ovy, ovSize, ovSize);
				ov.setFilled(true);
				ov.setColor(Color.BLACK);
				add(ov);
				}
			}
		}
	}
	private static final int N_ROWS = 8;
	private static final int N_COLUMNS = 8;
}
