package quan.abstractfadtorypattern;

import quan.abstractfactorypattern.color.Color;
import quan.abstractfactorypattern.shape.Shape;

public abstract class AbstractFactory {
	abstract public Shape getShape(String shapeType);
	abstract public Color getColor(String colorType);
}
