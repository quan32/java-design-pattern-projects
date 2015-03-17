package quan.mementopattern.test;

import quan.mementopattern.CareTaker;
import quan.mementopattern.Memento;
import quan.mementopattern.Originator;

public class MementoDemo {
	public static void main(String[] args) {
		Originator originator = new Originator("State1");
		CareTaker careTaker = new CareTaker();
		
		originator.setState("State2");
		careTaker.add(originator.saveStateToMemento());
		originator.setState("State3");
		careTaker.add(originator.saveStateToMemento());
		
		Memento memento1 = careTaker.get(0);
		System.out.println("State1:"+memento1.getState());
		Memento memento2 = careTaker.get(1);
		System.out.println("State2:"+memento2.getState());
	}
}
