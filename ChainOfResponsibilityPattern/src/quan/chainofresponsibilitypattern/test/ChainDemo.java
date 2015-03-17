package quan.chainofresponsibilitypattern.test;

import quan.chainofresponsibilitypattern.AbstractLogger;
import quan.chainofresponsibilitypattern.ConsoleLogger;
import quan.chainofresponsibilitypattern.ErrorLogger;
import quan.chainofresponsibilitypattern.FileLogger;

public class ChainDemo {
	public static void main(String[] args) {
		ChainDemo chainDemo = new ChainDemo();
		AbstractLogger chain = chainDemo.getLoggerChain();
		chain.logMessage(AbstractLogger.INFO, "Info log");
		chain.logMessage(AbstractLogger.DEBUG, "Debug log");
		chain.logMessage(AbstractLogger.ERROR, "Error log");
	}
	
	public AbstractLogger getLoggerChain() {
		ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		FileLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		fileLogger.setNextLogger(errorLogger);
		ConsoleLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		consoleLogger.setNextLogger(fileLogger);
		
		return consoleLogger;
	}
}
