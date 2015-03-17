package quan.decoratorpattern;

public class CircleDecorator extends Circle implements Decorator{

	@Override
	public void fillColor() {
		System.out.println("CircleDecorator::fillColor()");
	}

}
