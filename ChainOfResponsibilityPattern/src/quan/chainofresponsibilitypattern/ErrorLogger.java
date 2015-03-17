package quan.chainofresponsibilitypattern;

public class ErrorLogger extends AbstractLogger{

	public ErrorLogger(int level) {
		this.level = level;
	}
	
	@Override
	public void write() {
		System.out.println("Console:: ERROR");
	}

}
