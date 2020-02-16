/*
 * Chapter 11, exercise 13
 */
import acm.program.*;
import acm.graphics.*;

public class RotateLeft extends GraphicsProgram {
	public void run(){
		GImage image = new GImage("Images/Milkmaid.jpg");
		add(image);
		GImage rotatedImage = rotateLeft(image);
		add(rotatedImage, image.getWidth() + 20, 0);
	}
	private GImage rotateLeft(GImage image){
		/* Image */
		int[][] array = image.getPixelArray();
		int height = array.length;
		int width = array[0].length;
		/* new Array Image */
		int[][] newArray = new int[width][height];
		int newHeight = newArray.length;
		int newWidth = newArray[0].length;
		for(int row = 0; row < newHeight; row++){
			for(int col = 0; col < newWidth; col++){
				
				/* flips 90 degrees to left */
//				int p2 = newHeight - row - 1;
////			    int temp = array[col][p2];
//				newArray[row][col] = array[col][p2];
				
				/* flips 90 degrees to right */
				int p2 = newWidth - col - 1;
//				int temp = array[p2][row];
				newArray[row][col] = array[p2][row];
			}
		}
		return new GImage(newArray);
	}
}
