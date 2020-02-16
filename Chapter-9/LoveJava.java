import acm.graphics.*;

import java.awt.*;
public class LoveJava extends QuiltBlock {

	public LoveJava(double width, double height, Color color) {
		super(width, height, color);
		GPolygon heart = new GPolygon(width, height);
		heart.addVertex(-width /2, 0 );
		heart.addEdge(70.72, 70.72);
		heart.addEdge(70.72, -70.72);
		heart.addArc(100, 100, -45, 180);
		heart.addArc(100, 100, 45, 180);
		heart.setFilled(true);
		heart.setColor(Color.RED);
		heart.scale(0.7);
		add(heart, width / 2, height / 2);
		
		GLabel label = new GLabel("I");
		label.setFont("Arial-bold-16");
		label.setColor(Color.BLACK);
		add(label, width / 2 - label.getWidth() / 2, height / 3);
		
		label = new GLabel("Love");
		label.setFont("Arial-bold-16");
		label.setColor(Color.BLACK);
		add(label, width / 2 - label.getWidth() / 2, height / 2);
		
		label = new GLabel("Java");
		label.setFont("Arial-bold-16");
		label.setColor(Color.BLACK);
		add(label, width / 2 - label.getWidth() / 2, height - height / 3);
		
	}

}
