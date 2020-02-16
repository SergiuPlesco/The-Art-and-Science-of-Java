/*
 * Bouncing Ball
 */


import acm.program.*;
import acm.util.*;
import acm.graphics.*;
import java.awt.*;

public class BouncingBall extends GraphicsProgram {
	public void run(){
		double width = getWidth();
		double height = getHeight();
			GRect rect = new GRect(width, height);
			rect.setFilled(true);
			rect.setColor(Color.BLACK);
			add(rect);
		
		
		int initX = (getWidth() / 2) - (DIAM_BALL / 2);
		int initY = (getHeight() / 2) - (DIAM_BALL / 2);
		RandomGenerator random = RandomGenerator.getInstance();
		

		GOval ball = new GOval(initX, initY, DIAM_BALL, DIAM_BALL);
		ball.setFilled(true);
		ball.setColor(Color.YELLOW);
		add(ball);
		int dx = 1;// works only with value 1
		int dy = 1;// works only with value 1

		while (true) {
			ball.move(dx, dy);
			pause(PAUSE_TIME);

			if (ball.getY() == getHeight() - DIAM_BALL || ball.getY() == 0) {
				dy = -dy;

				ball.setColor(random.nextColor());
			}
			
			if (ball.getX() == getWidth() - DIAM_BALL || ball.getX() == 0) {
				dx = -dx;

				ball.setColor(random.nextColor());
			}

		}
	}
	

	private static final int DIAM_BALL = 25;
	private static final int PAUSE_TIME = 5;
}
