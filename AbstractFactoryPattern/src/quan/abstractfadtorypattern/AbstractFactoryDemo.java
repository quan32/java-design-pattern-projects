package quan.abstractfadtorypattern;

import quan.abstractfactorypattern.color.Color;
import quan.abstractfactorypattern.shape.Shape;

public class AbstractFactoryDemo {
	public static void main(String[] args) {
		FactoryProducer abstractFactory = new FactoryProducer();
		
		AbstractFactory shapeFactory= abstractFactory.getFactory("Shape");
		Shape circle = shapeFactory.getShape("Circle");
		circle.onDraw();
		
		AbstractFactory colorFactory= abstractFactory.getFactory("Color");
		Color red = colorFactory.getColor("Red");
		red.fill();
	}
}
