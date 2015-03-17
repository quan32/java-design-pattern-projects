package quan.strategypattern;

public class OperationAdd implements Strategy{

	@Override
	public int doOperation(int param1, int param2) {
		return param1+param2;
	}

}
