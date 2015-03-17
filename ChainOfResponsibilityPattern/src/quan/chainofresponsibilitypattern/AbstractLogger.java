package quan.chainofresponsibilitypattern;

public abstract class AbstractLogger {
	public static final int INFO = 1;
	public static final int DEBUG = 2;
	public static final int ERROR = 3;
	protected int level;
	protected AbstractLogger nextLogger;
	
	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}
	
	public void logMessage(int level, String message) {
		if(level == this.level) {
			this.write();
		} else {
			if(nextLogger != null) {
				System.out.println("next ...");
				nextLogger.logMessage(level, message);
			}
		}
	}
	
	public abstract void write();
	
}
