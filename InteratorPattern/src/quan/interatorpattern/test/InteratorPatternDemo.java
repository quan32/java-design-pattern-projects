package quan.interatorpattern.test;

import quan.interatorpattern.Group;
import quan.interatorpattern.Interator;

public class InteratorPatternDemo {
	public static void main(String[] args) {
		Group group = new Group();
		group.add(1);
		group.add(2);
		group.add(3);
		
		Interator interator = group.getInterator();
		while(interator.haveNext()) {
			Object object = interator.next();
			System.out.println(object.toString());
		}
	}
}
