/*
 * This program creates 5 buttons to draw different shapes when user clicks on button
 * 
 */
import acm.gui.*;
import acm.graphics.*;
import acm.util.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SimpleDraw extends GraphicsProgram {
	
	public void init(){
		addButtons();
		addMouseListeners();
		addActionListeners();
	}
	
	private void addButtons(){
		FilledRectangleIcon = new ImageIcon(new ImageIcon("Images/FilledRectangle.png").getImage().getScaledInstance(BUTTON_SIZE, BUTTON_SIZE, Image.SCALE_DEFAULT));
		filledRectBtn = new JButton(FilledRectangleIcon);
		filledRectBtn.setPreferredSize(new Dimension(BUTTON_SIZE, BUTTON_SIZE));
		filledRectBtn.setActionCommand("FilledRectangle");

		
		OutlinedRectangleIcon = new ImageIcon(new ImageIcon("Images/OutlinedRectangle.png").getImage().getScaledInstance(BUTTON_SIZE, BUTTON_SIZE, Image.SCALE_DEFAULT));
		outlinedRectBtn = new JButton(OutlinedRectangleIcon);
		outlinedRectBtn.setPreferredSize(new Dimension(BUTTON_SIZE, BUTTON_SIZE));
		outlinedRectBtn.setActionCommand("OutlinedRectangle");
		
		
		FilledEllipseIcon = new ImageIcon(new ImageIcon("Images/FilledEllipse.png").getImage().getScaledInstance(BUTTON_SIZE, BUTTON_SIZE, Image.SCALE_DEFAULT));
		filledEllipseBtn = new JButton(FilledEllipseIcon);
		filledEllipseBtn.setPreferredSize(new Dimension(BUTTON_SIZE, BUTTON_SIZE));
		filledEllipseBtn.setActionCommand("FilledEllipse");
		
		OutlinedEllipseIcon = new ImageIcon(new ImageIcon("Images/OutlinedEllipse.png").getImage().getScaledInstance(BUTTON_SIZE, BUTTON_SIZE, Image.SCALE_DEFAULT));
		outlinedEllipseBtn = new JButton(OutlinedEllipseIcon);
		outlinedEllipseBtn.setPreferredSize(new Dimension(BUTTON_SIZE, BUTTON_SIZE));
		outlinedEllipseBtn.setActionCommand("OutlinedEllipse");
		
		LineIcon = new ImageIcon(new ImageIcon("Images/Line.png").getImage().getScaledInstance(BUTTON_SIZE, BUTTON_SIZE, Image.SCALE_DEFAULT));
		lineBtn = new JButton(LineIcon);
		lineBtn.setPreferredSize(new Dimension(BUTTON_SIZE, BUTTON_SIZE));
		lineBtn.setActionCommand("Line");
		
		add(filledRectBtn, WEST);
		add(outlinedRectBtn, WEST);
		add(filledEllipseBtn, WEST);
		add(outlinedEllipseBtn, WEST);
		add(lineBtn, WEST);
		
	}

	 public void actionPerformed(ActionEvent e) { 
		 if(e.getActionCommand().equals("FilledRectangle")){
			 filledRectangle = true;
			 outlinedRectangle = false;
			 filledEllipse = false;
			 outlinedEllipse = false;
			 Line = false;
		 } else if(e.getActionCommand().equals("OutlinedRectangle")){
			 filledRectangle = false;
			 outlinedRectangle = true;
			 filledEllipse = false;
			 outlinedEllipse = false;
			 Line = false;
		 } else if(e.getActionCommand().equals("FilledEllipse")){
			 filledRectangle = false;
			 outlinedRectangle = false;
			 filledEllipse = true;
			 outlinedEllipse = false;
			 Line = false;
		 } else if(e.getActionCommand().equals("OutlinedEllipse")){
			 filledRectangle = false;
			 outlinedRectangle = false;
			 filledEllipse = false;
			 outlinedEllipse = true;
			 Line = false;
		 } else if(e.getActionCommand().equals("Line")){
			 filledRectangle = false;
			 outlinedRectangle = false;
			 filledEllipse = false;
			 outlinedEllipse = false;
			 Line = true;
		 }
	}
		 
	 /* 
  	 * Called on mouse press to create a new shape
  	 * 
  	 */
  	public void mousePressed(MouseEvent e){
  		last = new GPoint(e.getPoint());
		gobj = getElementAt(last);
  		
  		
		if(filledRectangle == true){
			setX = e.getX();//gets X coordinate of mouse and stores in setX
			setY = e.getY();//gets Y coordinate of mouse and stores in setY
			rect = new GRect(setX, setY, 0, 0);//create new rect with coordinates - setX and setY with 0 width and height
			rect.setFilled(true);
			rect.setColor(Color.YELLOW);
		      add(rect);
			clickPoint = new GPoint(e.getPoint());//get GPoint, coordinates when mouse is pressed
		} else if (outlinedRectangle == true){
			setX = e.getX();//gets X coordinate of mouse and stores in setX
			setY = e.getY();//gets Y coordinate of mouse and stores in setY
			rect = new GRect(setX, setY, 0, 0);//create new rect with coordinates - setX and setY with 0 width and height
			rect.setFilled(false);
//			rect.setColor(Color.YELLOW);
	        add(rect);
			clickPoint = new GPoint(e.getPoint());//get GPoint, coordinates when mouse is pressed
		} else if(filledEllipse == true){
			setX = e.getX();//gets X coordinate of mouse and stores in setX
			setY = e.getY();//gets Y coordinate of mouse and stores in setY
			ellipse = new GOval(setX, setY, 0, 0);//create new rect with coordinates - setX and setY with 0 width and height
			ellipse.setFilled(true);
			ellipse.setColor(Color.GREEN);
	        add(ellipse);
			clickPoint = new GPoint(e.getPoint());//get GPoint, coordinates when mouse is pressed
		} else if(outlinedEllipse == true){
			setX = e.getX();//gets X coordinate of mouse and stores in setX
			setY = e.getY();//gets Y coordinate of mouse and stores in setY
			ellipse = new GOval(setX, setY, 0, 0);//create new rect with coordinates - setX and setY with 0 width and height
			ellipse.setFilled(false);
//			rect.setColor(Color.YELLOW);
	        add(ellipse);
			clickPoint = new GPoint(e.getPoint());//get GPoint, coordinates when mouse is pressed
		} else if(Line = true){
			line = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
			add(line);
		}
	
		
  	}
  	
  	/*
  	 * Called on mouse drag to set the size and bounds of the rect
  	 * created on mousePressed 
  	 */
  	public void mouseDragged(MouseEvent e){
  		if(filledRectangle == true && gobj == null){
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
  		} else if(outlinedRectangle == true && gobj == null) {
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
  		} else if(filledEllipse == true && gobj == null){
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
		    ellipse.setBounds(minX, minY, maxX - minX, maxY - minY);
  		} else if(outlinedEllipse == true && gobj == null){
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
		    ellipse.setBounds(minX, minY, maxX - minX, maxY - minY);
  		} else if(Line == true && gobj == null){
  			line.setEndPoint(e.getX(), e.getY());
  		}
  		/*
  		 * Move object
  		 */
  		if(gobj != null){
  			gobj.move(e.getX() - last.getX(), e.getY() - last.getY());
  			last = new GPoint(e.getPoint());
  		}
  	}
  	public void mouseClicked(MouseEvent e){
  		if(gobj != null) gobj.sendToFront();
  	}

	
	/* Private instance variables */
	private GRect rect;
	private GOval ellipse;
	private GLine line;
	private GPoint clickPoint;
	
	double setX;//set origin X
	double setY;//set origin Y
	
	private boolean filledRectangle, outlinedRectangle, filledEllipse, outlinedEllipse, Line;
	

	private GObject gobj;
	private GPoint last;
	
	private static final int BUTTON_SIZE = 50;
	
	private JButton filledRectBtn, outlinedRectBtn, filledEllipseBtn, outlinedEllipseBtn, lineBtn;
	private ImageIcon FilledRectangleIcon, OutlinedRectangleIcon, FilledEllipseIcon, OutlinedEllipseIcon, LineIcon;
}
