package quan.prototypepattern.test;

import java.util.HashMap;

import quan.prototypepattern.Circle;
import quan.prototypepattern.Retangle;
import quan.prototypepattern.Shape;
import quan.prototypepattern.ShapeFactory;
import quan.prototypepattern.Square;

public class PrototypePatternTest {
	private static HashMap<String, Shape> hashMap = new HashMap<String, Shape>();
	
	public static void main(String[] args) {
		PrototypePatternTest.createMaps();
		Circle circle1 = (Circle)hashMap.get("Circle");
		Circle circle2 = (Circle)circle1.clone();
		System.out.println("Id="+System.identityHashCode(circle1));
		System.out.println("Id="+System.identityHashCode(circle2));
		circle1.setType("Vovan");
		circle1.onDraw();
		circle2.onDraw();
		
	}
	
	public static void createMaps() {
		
		Circle circle = (Circle)ShapeFactory.getShape("Circle");
		circle.setId(1);
		hashMap.put("Circle", circle);
		
		Retangle retangle = (Retangle)ShapeFactory.getShape("Retangle");
		retangle.setId(2);
		hashMap.put("Retangle", retangle);
		
		Square square = (Square)ShapeFactory.getShape("Square");
		square.setId(3);
		hashMap.put("Square", square);
	}
	
	public Shape get(String type) {
		Shape shape = (Shape)hashMap.get(type);
		
		return (Shape)shape.clone();
	}
}
