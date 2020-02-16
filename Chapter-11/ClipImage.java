/*
 * Chapter 11, exercise 14
 */
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import acm.program.*;
import acm.graphics.*;

public class ClipImage extends GraphicsProgram {
	public void run(){
		image = new GImage("Images/Milkmaid.jpg");

		add(image);
	}
	public void init(){
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e){
		point = new GPoint(e.getPoint());
		obj = getElementAt(point);
		if(obj != null){
		
			getX = e.getX();
			getY = e.getY();
			rect = new GRect(getX, getY, 0, 0);//create new rect with coordinates - setX and setY with 0 width and height
			rect.setColor(Color.WHITE);
	       
			clickPoint = new GPoint(e.getPoint());
			
		}
	}
	public void mouseDragged(MouseEvent e){
		
		int minX = (int)Math.min(e.getX(), clickPoint.getX());
        int minY = (int)Math.min(e.getY(), clickPoint.getY());
       
        int maxX = (int)Math.max(e.getX(), clickPoint.getX());
        int maxY = (int)Math.max(e.getY(), clickPoint.getY());
       
        rect.setBounds(minX, minY, maxX - minX, maxY - minY);
        add(rect);
       
       
       
      
       
	}
	public void mouseReleased(MouseEvent e){
		int rectX = (int)rect.getX();
		int rectY = (int)rect.getY();
		int rectWidth = (int)rect.getWidth();
		int rectHeight = (int)rect.getHeight();
		
		imgArray = image.getPixelArray();
		int imgArrayWidth = imgArray[0].length;
		int imgArrayHeight = imgArray.length;
		array = new int[rectHeight][rectWidth];
		for(int i = 0; i < rectHeight; i++){
			for(int j = 0; j < rectWidth; j++){
				array[i][j] = imgArray[rectY + i][rectX + j];
			}
		
		}
		GImage clippedImage = new GImage(array);
		add(clippedImage, image.getWidth() + 20, 0);
	}
	private GImage clipImage(GImage image){
		GImage clippedImage = new GImage("");
		
		return clippedImage;
	}
	
	/* Instance variables */
	private GObject obj;
	private GPoint point;
	private GPoint clickPoint;
	private int[][] array;
	private int[][] imgArray;
	private GRect rect;
	private GImage image;
	private GImage clippedImage;;
	int getX;
	int getY;
}
