package quan.prototypepattern;

public class Retangle extends Shape{
	public Retangle() {
		type = "Retangle";
	}
	
	public void onDraw() {
		System.out.println("Retangle::onDraw()");
	}
	
}
