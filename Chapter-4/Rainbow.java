/*
 * This program draws a rainbow on screen.
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Rainbow extends GraphicsProgram {
	/*
	 * Variables for rainbow
	 */
	int circleDiameter = 1100;
	double stripeThick = 30;
	int down = 400; //move down Y
		
	public void run() {
		redStripe();
		orangeStripe();
		yellowStripe();
		greenStripe();
		blueStripe();
		magentaStripe();
		whiteStripe();
	}
	private void redStripe() {
		int circleCenterX = getWidth()/2 - circleDiameter/2;
		int circleCenterY = getHeight()/2 - circleDiameter/2;
		GOval redStripe = new GOval(circleCenterX, circleCenterY + down, circleDiameter, circleDiameter);
		redStripe.setFilled(true);
		redStripe.setColor(Color.RED);
		add(redStripe);
	}
	private void orangeStripe(){
		int circleCenterX = getWidth()/2 - circleDiameter/2;
		int circleCenterY = getHeight()/2 - circleDiameter/2;
		GOval orangeStripe = new GOval(circleCenterX + stripeThick/2 , (circleCenterY + stripeThick/2) + down,
									circleDiameter-stripeThick, circleDiameter-stripeThick);
		orangeStripe.setFilled(true);
		orangeStripe.setColor(Color.ORANGE);
		add(orangeStripe);
	}
	private void yellowStripe(){
		int circleCenterX = getWidth()/2 - circleDiameter/2;
		int circleCenterY = getHeight()/2 - circleDiameter/2;
		GOval yellowStripe = new GOval(circleCenterX + stripeThick , (circleCenterY + stripeThick) + down,
									circleDiameter-stripeThick * 2, circleDiameter-stripeThick * 2);
		yellowStripe.setFilled(true);
		yellowStripe.setColor(Color.YELLOW);
		add(yellowStripe);
	}
	private void greenStripe(){
		int circleCenterX = getWidth()/2 - circleDiameter/2;
		int circleCenterY = getHeight()/2 - circleDiameter/2;
		GOval greenStripe = new GOval(circleCenterX + stripeThick *1.5, (circleCenterY + stripeThick *1.5) + down,
									circleDiameter-stripeThick * 3, circleDiameter-stripeThick * 3);
		greenStripe.setFilled(true);
		greenStripe.setColor(Color.GREEN);
		add(greenStripe);
	}
	private void blueStripe(){
		int circleCenterX = getWidth()/2 - circleDiameter/2;
		int circleCenterY = getHeight()/2 - circleDiameter/2;
		GOval blueStripe = new GOval(circleCenterX + stripeThick * 2, (circleCenterY + stripeThick * 2) + down,
									circleDiameter-stripeThick * 4, circleDiameter-stripeThick * 4);
		blueStripe.setFilled(true);
		blueStripe.setColor(Color.BLUE);
		add(blueStripe);
	}
	private void magentaStripe(){
		int circleCenterX = getWidth()/2 - circleDiameter/2;
		int circleCenterY = getHeight()/2 - circleDiameter/2;
		GOval magentaStripe = new GOval(circleCenterX + stripeThick * 2.5, (circleCenterY + stripeThick * 2.5) + down,
									circleDiameter-stripeThick * 5, circleDiameter-stripeThick * 5);
		magentaStripe.setFilled(true);
		magentaStripe.setColor(Color.MAGENTA);
		add(magentaStripe);
	}
	
	private void whiteStripe(){
		int circleCenterX = getWidth()/2 - circleDiameter/2;
		int circleCenterY = getHeight()/2 - circleDiameter/2;
		GOval whiteStripe = new GOval(circleCenterX + stripeThick * 3, (circleCenterY + stripeThick * 3) + down,
									circleDiameter-stripeThick * 6, circleDiameter-stripeThick * 6);
		whiteStripe.setFilled(true);
		whiteStripe.setColor(Color.WHITE);
		add(whiteStripe);
	}
	
}
