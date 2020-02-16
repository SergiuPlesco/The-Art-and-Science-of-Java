/*
 * Chapter 11, Exercise 15
 */
import acm.program.*;
import acm.graphics.*;
public class NegativeColor extends GraphicsProgram {
	public void run(){
		GImage image = new GImage("Images/Milkmaid.jpg");
		add(image);
		GImage negativeImage = makeColorNegative(image);
		add(negativeImage, image.getWidth() + 20, 0);
	}
	
	private GImage makeColorNegative(GImage image){
		int[][] array = image.getPixelArray();
		int height = array.length;
		int width = array[0].length;
		int red = 0;
		int green = 0;
		int blue = 0;
		for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
				int pixel = array[i][j];
				red = 0xFF - ((pixel >> 16) & 0xFF);
				green = 0xFF - ((pixel >> 8) & 0xFF);
				blue = 0xFF - (pixel & 0xFF);
				pixel = (0xFF << 24) | (red << 16) | (green << 8) | blue;
				array[i][j] = pixel;
			}
		}
		println(red + ", " + green + " , " + blue);
		return new GImage(array);
	}
}
