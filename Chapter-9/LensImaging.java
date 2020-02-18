/*
 * This program calculate the distance and size of an image
 * placed in front of a convex lens with given focal length and at a given distance
 */
import acm.program.*;
import acm.graphics.*;
public class LensImaging extends GraphicsProgram {
	public void run(){
		double wLens = 50;
		double hLens = 150;
		
		GImage image = new GImage("Bell.png");
		GLens lens = new GLens(wLens, hLens);
		
		double focalLength = 75;//lens focal point
		double hImage = image.getHeight();
		double dImage =  350;//image distance in front of lens
		double dSecondImage = (1 / (1 / focalLength - 1 / dImage));//image distance from lens
		double hSecondImage = (hImage * dSecondImage) / dImage; //the height of image behind lens
		double scale = hSecondImage / 100;//height in decimal, scale down
		
		println(dSecondImage);//print on console the image distance behind lens
		GImage secondImage = new GImage("Bell.png");
		secondImage.scale(scale);//scale lens
		
		add(lens, (getWidth() - wLens) / 2, (getHeight() - hLens) / 2);//add lens in the center
		add(image, (getWidth() / 2) + 150, (getHeight() - image.getHeight()) / 2);//add image at given x, y in front of lens
		
		//add second image behind the lens with x, y, height calculated with above formulas
		add(secondImage, getWidth() / 2 - dSecondImage - (secondImage.getWidth() / 2), (getHeight() - secondImage.getHeight()) / 2);
		
		//rect with 1 px width to check position of second image
		GRect rect = new GRect(1, 100);
		add(rect, getWidth() / 2 - dSecondImage -(rect.getWidth() / 2), getHeight() / 2 - 50);
		
	}
}
