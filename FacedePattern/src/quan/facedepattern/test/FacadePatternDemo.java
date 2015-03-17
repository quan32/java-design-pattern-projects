package quan.facedepattern.test;

import quan.facedepattern.ShapeMaker;

public class FacadePatternDemo {
	
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRetangle();
		shapeMaker.drawSquare();
	}
}
