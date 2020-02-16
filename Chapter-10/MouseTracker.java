/*
 * This program display the coordinates of the mouse 
 * as the user moves or drags mouse in the window.
 */
import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseTracker extends GraphicsProgram {
	
	public void init(){
		coord = new GLabel("");
		addMouseListeners();
	}
	
	public void mouseMoved(MouseEvent e){
		coord.setLabel(e.getX() + " ," + e.getY());
		add(coord, e.getX() - coord.getWidth(), e.getY());
	}
	
	public void mouseDragged(MouseEvent e){
		coord.setLabel(e.getX() + " ," + e.getY());
		add(coord, e.getX() - coord.getWidth(), e.getY());
	}
	
	
	/* Private instance variables */
	GLabel coord;
}
