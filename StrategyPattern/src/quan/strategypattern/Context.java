package quan.strategypattern;

public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int executeStrategy(int param1, int param2) {
		return this.strategy.doOperation(param1, param2);
	}
}
