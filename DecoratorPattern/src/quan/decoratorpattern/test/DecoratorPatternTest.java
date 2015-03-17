package quan.decoratorpattern.test;

import quan.decoratorpattern.Circle;
import quan.decoratorpattern.CircleDecorator;

public class DecoratorPatternTest {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.draw();
		
		CircleDecorator decoratorCircle = new CircleDecorator();
		decoratorCircle.draw();
		decoratorCircle.fillColor();
	}
}
