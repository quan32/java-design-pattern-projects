package quan.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private int status;
	private List<Observer> observers;
	
	public Subject() {
		observers = new ArrayList<Observer>();
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public void attach(Observer observer) {
		if(observers.add(observer));
	}
	
	public void notifyAllObservers() {
		for (int i = 0; i < observers.size(); i++) {
			observers.get(i).update();
		}
	}
}
