package quan.observerpattern;

public class BinaryObserver extends Observer{
	public BinaryObserver(Subject subject){
		super(subject);
	}
	
	public void update() {
		System.out.println("BinaryObserver::get notify from subject");
	}
}
