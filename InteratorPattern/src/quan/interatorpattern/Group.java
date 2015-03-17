package quan.interatorpattern;

import java.util.ArrayList;
import java.util.List;

public class Group implements Container{
	List<Object> list;
	public Group() {
		list = new ArrayList<Object>();
	}
	
	public void add(Object object) {
		list.add(object);
	}
	
	public Object get(int index) {
		return list.get(index);
	}

	@Override
	public Interator getInterator() {
		return new GroupInterator();
	}
	
	private class GroupInterator implements Interator{
		private int index=0;
		
		@Override
		public boolean haveNext() {
			return (index < list.size());
		}

		@Override
		public Object next() {
			return list.get(index++);
		}
		
	}
	
}
