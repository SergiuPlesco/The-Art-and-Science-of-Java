/*
 * Chapter 10 ex 3 
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import java.awt.event.*;
public class DrawFaceMoveEye extends GraphicsProgram {
	
	public void run(){
		faceWidth = 200;
		faceHeight = 300;
		faceX = getWidth() / 2 - faceWidth / 2;
		faceY = getHeight() / 2 - faceHeight / 2;
		face = new GFace(faceWidth, faceHeight);
		add(face, faceX, faceY);
		
		
		GOval leftEye = face.leftPupil;
		GOval rightEye = face.rightPupil;
		radius = 8;
		xLeftEye = faceX + leftEye.getX();
		yLeftEye = faceY + leftEye.getY();
		
		xRightEye = faceX + rightEye.getX();
		yRightEye = faceY + rightEye.getY();
		
		pupilRadius = 5;
		pupilLeftEye = new GOval(pupilRadius * 2, pupilRadius * 2);
		pupilLeftEye.setFilled(true);
		pupilRightEye = new GOval(pupilRadius * 2, pupilRadius * 2);
		pupilRightEye.setFilled(true);

	}
	public void init(){
		
		addMouseListeners();
	}
	public void mouseMoved(MouseEvent e){
		/* Left eye */
		double angle = GMath.angle(e.getX() - xLeftEye, e.getY() - yLeftEye);
		double sin = GMath.sinDegrees(angle);
		double cos = GMath.cosDegrees(angle);
		double pupilx = radius * cos;
		double pupily = radius * -sin;
		add(pupilLeftEye, pupilx + xLeftEye, pupily + yLeftEye);
		
		
		/* Right eye */
		double angleRightEye = GMath.angle(e.getX() - xRightEye, e.getY() - yRightEye);
		double sinRightEye = GMath.sinDegrees(angleRightEye);
		double cosRightEye = GMath.cosDegrees(angleRightEye);
		double pupilXRightEye = radius * cosRightEye;
		double pupilYRightEye = radius * -sinRightEye;
		add(pupilRightEye, pupilXRightEye + xRightEye, pupilYRightEye + yRightEye);
	}
	
	
	/* Instance variables */
	double faceWidth;
	double faceHeight;
	double faceX;
	double faceY;
	
	double pupilRadius;
	double radius;
	double xLeftEye;
	double yLeftEye;
	double xRightEye;
	double yRightEye;
	GFace face;
	
	GOval pupilLeftEye, pupilRightEye;
}
