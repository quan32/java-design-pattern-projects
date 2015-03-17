package quan.abstractfactorypattern.shape;

import quan.abstractfactorypattern.color.Color;
import quan.abstractfadtorypattern.AbstractFactory;

public class ShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		
		if (shapeType == "Circle") {
			return new Circle();
		} else if (shapeType == "Retangle") {
			return new Retangle();
		} else if(shapeType == "Square"){
			return new Square();
		}
		
		return null;
	}

	@Override
	public Color getColor(String colorType) {
		return null;
	}
	
}
