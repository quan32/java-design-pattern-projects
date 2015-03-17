package quan.chainofresponsibilitypattern;

public class ConsoleLogger extends AbstractLogger{

	public ConsoleLogger(int level) {
		this.level = level;
	}
	
	@Override
	public void write() {
		System.out.println("Console:: INFO");
	}

}
