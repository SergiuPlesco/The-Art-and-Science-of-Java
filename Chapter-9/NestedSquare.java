import acm.graphics.*;
import java.awt.*;
public class NestedSquare extends QuiltBlock {

	public NestedSquare(double width, double height, Color color) {
		super(width, height, color);
		GPolygon square = new GPolygon(width, height);
		square.addVertex(-width, -height / 2);
		square.addEdge(width / 2, height / 2);
		square.addEdge(width / 2, -height / 2);
		square.addEdge(-width / 2, -height / 2);
		square.addEdge(-width / 2, height / 2);
		square.setFilled(true);
		square.setColor(Color.MAGENTA);
		add(square);
		
		GPolygon square2 = new GPolygon(width, height);
		square2.addVertex(-width / 2, -height);
		square2.addEdge(width / 2, height / 2);
		square2.addEdge(width / 2, -height / 2);
		square2.addEdge(-width / 2, -height / 2);
		square2.addEdge(-width / 2, height / 2);
		square2.setFilled(true);
		square2.setColor(Color.CYAN);
		square2.rotate(45);
//		square.recenter();
		square2.scale(0.7);
//		square.sendForward();
		add(square2);
		
		GPolygon square3 = new GPolygon(width, height);
		square3.addVertex(-width * 1.5, -height);
		square3.addEdge(width / 2, height / 2);
		square3.addEdge(width / 2, -height / 2);
		square3.addEdge(-width / 2, -height / 2);
		square3.addEdge(-width / 2, height / 2);
		square3.setFilled(true);
		square3.setColor(Color.MAGENTA);
//		square3.rotate(45);
//		square.recenter();
		square3.scale(0.5);
//		square.sendForward();
		add(square3);
	}

}
