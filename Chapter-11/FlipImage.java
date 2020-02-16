/*
 * Chapter 11, exercise 12, flip image
 */
import acm.program.*;
import acm.graphics.*;
public class FlipImage extends GraphicsProgram {
	public void run(){
		GImage image = new GImage("Images/Milkmaid.jpg");
		double scale = 0.8;
		image.scale(scale);
		add(image);
		GImage verticalFlip = flipVertical(image);
		verticalFlip.scale(scale);
		add(verticalFlip, image.getWidth() + 15, 0);
		
		GImage horizontalFlip = flipHorizontal(image);
		horizontalFlip.scale(scale);
		add(horizontalFlip, image.getWidth() * 2 + 30, 0);
	}
	
	/* Flip image vertically */
	private GImage flipVertical(GImage image){
		int[][] array = image.getPixelArray();
		int height = array.length;
		int width = array[0].length;
		for(int col = 0; col < width; col++){
			for(int p1 = 0; p1 < height / 2; p1++){
				int p2 = height - p1 - 1;
				int temp = array[p1][col];
				array[p1][col] = array[p2][col];
				array[p2][col] = temp;
			}
		}
		
		return new GImage(array);
	}
	
	/* Flip  image horizontally */
	private GImage flipHorizontal(GImage image){
		int[][] array = image.getPixelArray();
		int height = array.length;
		int width = array[0].length;
		for(int row = 0; row < height; row++){
			for(int p1 = 0; p1 < width / 2; p1++){
				int p2 = width - p1 - 1;
				int temp = array[row][p1];
				array[row][p1] = array[row][p2];
				array[row][p2] = temp;
			}
		}
		return new GImage(array);
	}
}
