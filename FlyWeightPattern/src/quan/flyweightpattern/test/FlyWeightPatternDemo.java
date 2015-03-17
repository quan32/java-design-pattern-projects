package quan.flyweightpattern.test;

import java.util.Random;
import quan.flyweightpattern.Circle;
import quan.flyweightpattern.ShapeFactory;

public class FlyWeightPatternDemo {
	public static void main(String[] args) {
		FlyWeightPatternDemo flyWeightPatternDemo = new FlyWeightPatternDemo();
		ShapeFactory shapeFactory = new ShapeFactory();
		
		for (int i = 0; i < 20; i++) {
			final Circle circle = shapeFactory.getShape(flyWeightPatternDemo.colorRandom());
			circle.setX(flyWeightPatternDemo.randomX());
			circle.setY(flyWeightPatternDemo.randomY());
			circle.draw();
		}
	}
	
	public String colorRandom() {
		String color = "red";
		Random random = new Random();
				
		int i = 1 + random.nextInt()%5;
		switch (i) {
		case 1:
			color = "red";
			break;
		case 2:
			color = "green";
			break;
		case 3:
			color = "blue";
			break;
		case 4:
			color = "yellow";
			break;
		case 5:
			color = "black";
			break;
		default:
			break;
		}
		
		return color;
	}
	
	public int randomX() {
		Random random = new Random();
		int x = 1 + random.nextInt()%100;
		
		return x;
	}
	
	public int randomY() {
		Random random = new Random();
		int y = 1 + random.nextInt()%100;
		
		return y;
	}
}
