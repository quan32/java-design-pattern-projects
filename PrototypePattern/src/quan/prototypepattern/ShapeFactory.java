package quan.prototypepattern;

public class ShapeFactory {
	
	public ShapeFactory() {
		
	}
	
	public static Shape getShape(String type) {
		if(type.equals("Circle")) {
			return new Circle();
		} else if(type.equals("Retangle")) {
			return new Retangle();
		} else {
			return new Square();
		}
	}
}
