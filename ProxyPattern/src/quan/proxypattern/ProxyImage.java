package quan.proxypattern;

import java.util.HashMap;

public class ProxyImage implements Image{
	private HashMap<String, Image> hashMap;
	
	public ProxyImage() {
		hashMap = new HashMap<>();
	}
	
	@Override
	public void display(String fileName) {
		Image image;
		
		image = hashMap.get(fileName);
		if(image==null) {
			image = new RealImage(fileName);
			image.display(fileName);
			hashMap.put(fileName, image);
		} else {
			image.display(fileName);
		}
		
	}	
}
