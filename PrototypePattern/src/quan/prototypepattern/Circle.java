package quan.prototypepattern;

public class Circle extends Shape{
	public Circle() {
		type = "Circle";
	}
	
	public void onDraw() {
		System.out.println("Circle::onDraw()  "+type);
	}
	
}
