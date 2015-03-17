package quan.flyweightpattern;

import java.util.HashMap;

public class ShapeFactory {
	private HashMap<String, Circle> hashMap;
	
	public ShapeFactory() {
		hashMap = new HashMap<String, Circle>();
	}
	
	public Circle getShape(String color) {
		if(hashMap.get(color) ==null) {
			hashMap.put(color, new Circle(color));
		}
		
		return hashMap.get(color);
	}
	
}
