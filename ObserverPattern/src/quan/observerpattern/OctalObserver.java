package quan.observerpattern;

public class OctalObserver extends Observer{
	public OctalObserver(Subject subject){
		super(subject);
	}
	
	public void update() {
		System.out.println("OctalObserver::get notify from subject");
	}
}
