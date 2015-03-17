package quan.prototypepattern;

public class Square extends Shape{
	public Square() {
		type = "Square";
	}
	
	public void onDraw() {
		System.out.println("Square::onDraw()");
	}
	
}
