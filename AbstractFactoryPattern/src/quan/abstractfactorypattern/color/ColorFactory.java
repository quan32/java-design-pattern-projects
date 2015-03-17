package quan.abstractfactorypattern.color;

import quan.abstractfactorypattern.shape.Shape;
import quan.abstractfadtorypattern.AbstractFactory;

public class ColorFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	public Color getColor(String colorType) {
		if (colorType == null) {
			return null;
		}
		
		if (colorType == "Blue") {
			return new Blue();
		} else if (colorType == "Green") {
			return new Green();
		} else if(colorType == "Red"){
			return new Red();
		}
		
		return null;
	}

}
