/*
 * This program draws a rectangle when the user presses the mouse, drags and releases it
 * 
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import java.awt.event.*;
public class DrawRectangle extends GraphicsProgram {
	public void init(){
		addMouseListeners();
	}
	
	/* 
	 * Called on mouse press to create a new rectangle */
	public void mousePressed(MouseEvent e){
		setX = e.getX();//gets X coordinate of mouse and stores in setX
		setY = e.getY();//gets Y coordinate of mouse and stores in setY
		rect = new GRect(setX, setY, 0, 0);//create new rect with coordinates - setX and setY with 0 width and height
		rect.setFilled(true);
		rect.setColor(Color.YELLOW);
        add(rect);
		clickPoint = new GPoint(e.getPoint());//get GPoint, coordinates when mouse is pressed
	}
	
	/*
	 * Called on mouse drag to set the size and bounds of the rect
	 * created on mousePressed 
	 */
	public void mouseDragged(MouseEvent e){
		/*
		 * get the min value between the X, Y of mouse now and mouse pressed(clickPoint)
		 * storing the values in variables helps to draw rect in every direction of the mouse
		 *  not only to right and down
		 */
		double minX = Math.min(e.getX(), clickPoint.getX());
        double minY = Math.min(e.getY(), clickPoint.getY());
        /*
         * get max value between the X, Y of mouse now and mouse pressed(clickPoint)
         * after dragging the mouse, storing the values in variables helps to draw 
         * rect in every direction of the mouse not only to right and down
         */
        double maxX = Math.max(e.getX(), clickPoint.getX());
        double maxY = Math.max(e.getY(), clickPoint.getY());
        /*
         * Sets new origin and size of rect using setBounnds with values stored in variables above,
         * following the mouse cursor
         */
        rect.setBounds(minX, minY, maxX - minX, maxY - minY);
	}
	
	/* Private instance variables */
	private GRect rect;
	private GPoint clickPoint;
	
	double setX;//set origin X
	double setY;//set origin Y
}
