package quan.bridgepattern.test;

import quan.bridgepattern.Circle;
import quan.bridgepattern.GreenCircle;
import quan.bridgepattern.RedCircle;
import quan.bridgepattern.Shape;

public class BridgePatternDemo {
	public static void main(String[] args) {
		
		Shape redCircle = new Circle(new RedCircle());
		redCircle.draw();
		
		Shape greenCircle = new Circle(new GreenCircle());
		greenCircle.draw();
	}
}
