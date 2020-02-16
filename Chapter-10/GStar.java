import acm.graphics.*;
/**
 * Defines a new GObject class that appears as a five-pointed star.
 * @author sergi
 *
 */
public class GStar extends GPolygon {
	/**
	 * Creates a new GStar centered at the origin with the specified
	 * horizontal width.
	 * @param width The width of the star
	 */
	public GStar(double width){
		double dx = width / 2;
		double dy = dx * GMath.tanDegrees(18);
		double edge = width / 2 - GMath.tanDegrees(36);
		addVertex(-dx, -dy);
		int angle = 0;
		for(int i = 0; i < 5; i++){
			addPolarEdge(edge, angle);
			addPolarEdge(edge, angle + 72);
			angle -= 72;
		}
	}
}
