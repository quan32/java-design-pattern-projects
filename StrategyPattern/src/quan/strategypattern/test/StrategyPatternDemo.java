package quan.strategypattern.test;

import quan.strategypattern.Context;
import quan.strategypattern.OperationAdd;
import quan.strategypattern.OperationMultiply;

public class StrategyPatternDemo {
	public static void main(String[] args) {
		Context context;
		int value;
		
		context = new Context(new OperationAdd());
		value = context.executeStrategy(2, 3);
		System.out.println("Value="+value);
		
		context = new Context(new OperationMultiply());
		value = context.executeStrategy(2, 3);
		System.out.println("Value="+value);
	}
}
