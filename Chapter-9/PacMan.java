/*
 * Chapter 9 ex 12, PacMan
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.*;
public class PacMan extends GraphicsProgram {
	public void run(){
		double cx = getWidth() / 2;
		double cy = getHeight() / 2;
		double r = 50;
		double startAngle = 45;
		GArc pacman = new GArc(2 * r, 2 * r, startAngle, 360 - (startAngle * 2));
		pacman.setFilled(true);
		pacman.setFillColor(Color.ORANGE);
		add(pacman, cx - r, cy - r);
		
		/* How much to move pacman in on x axe */
		double dx = 10;
		double dy = 0;
		
		/* Moves pacman from left to right */
		while(true){
			
			
			pacman.setStartAngle(startAngle-=15);
			pacman.setSweepAngle(360 - (startAngle * 2));
			pacman.move(dx, dy);
			pause(200);
			pacman.setStartAngle(startAngle-=15);
			pacman.setSweepAngle(360 - (startAngle * 2));
			pacman.move(dx, dy);
			pause(200);
			pacman.setStartAngle(startAngle-=15);
			pacman.setSweepAngle(360 - (startAngle * 2));
			pacman.move(dx, dy);
			pause(200);
			

			pacman.setStartAngle(startAngle+=15);
			pacman.setSweepAngle(360 - (startAngle * 2));
			pacman.move(dx, dy);
			pause(200);
			pacman.setStartAngle(startAngle+=15);
			pacman.setSweepAngle(360 - (startAngle * 2));
			pacman.move(dx, dy);
			pause(200);
			pacman.setStartAngle(startAngle+=15);
			pacman.setSweepAngle(360 - (startAngle * 2));
			pacman.move(dx, dy);
			pause(200);
			
			
			

			if(pacman.getX() > getWidth() + r){
				add(pacman, - r, cy - r);
			}
		}
	}
}
