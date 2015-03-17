package quan.observerpattern.test;

import quan.observerpattern.BinaryObserver;
import quan.observerpattern.OctalObserver;
import quan.observerpattern.Subject;

public class ObserverPatternDemo {
	public static void main(String[] args) {
		Subject subject = new Subject();
		new BinaryObserver(subject);
		new OctalObserver(subject);
		
		subject.notifyAllObservers();
	}
}
