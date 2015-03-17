package quan.proxypattern;

public class RealImage implements Image{
	
	public RealImage(String fileName) {
		load(fileName);
	}

	@Override
	public void display(String fileName) {
		System.out.println("Display:"+fileName);
		
	}
	
	public void load(String fileName) {
		System.out.println("Loading:"+fileName);
	}
}
