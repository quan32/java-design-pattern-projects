package quan.abstractfadtorypattern;

import quan.abstractfactorypattern.color.ColorFactory;
import quan.abstractfactorypattern.shape.ShapeFactory;

public class FactoryProducer {
	public AbstractFactory getFactory(String factoryType) {
		if (factoryType == null) {
			return null;
		}
		
		if (factoryType == "Shape") {
			return new ShapeFactory();
		} else if (factoryType == "Color") {
			return new ColorFactory();
		}
		
		return null;
	}
}
