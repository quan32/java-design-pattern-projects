package quan.statepattern.test;

import quan.statepattern.Context;
import quan.statepattern.StartState;
import quan.statepattern.StopState;

public class StatePatternDemo {
	public static void main(String[] args) {
		Context context = new Context();
		new StartState().doAction(context);
		context.print();
		new StopState().doAction(context);
		context.print();
	}
}
