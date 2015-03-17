package quan.mementopattern;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List<Memento> mementoList;
	
	public CareTaker() {
		mementoList = new ArrayList<Memento>();
	}
	
	public void add (Memento memento) {
		mementoList.add(memento);
	}
	
	public Memento get(int index) {
		if(!mementoList.isEmpty() && index < mementoList.size())
			return mementoList.get(index);
		else
			return null;
	}
}
