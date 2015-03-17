package quan.facedepattern;

public class ShapeMaker {
	private Circle circle;
	private Retangle retangle;
	private Square square;
	
	public ShapeMaker() {
		circle = new Circle();
		retangle = new Retangle();
		square = new Square();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawRetangle() {
		retangle.draw();
	}
	
	public void drawSquare() {
		square.draw();
	}
}
