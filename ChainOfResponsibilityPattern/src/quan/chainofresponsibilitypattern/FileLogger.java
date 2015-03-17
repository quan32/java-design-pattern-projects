package quan.chainofresponsibilitypattern;

public class FileLogger extends AbstractLogger{

	public FileLogger(int level) {
		this.level = level;
	}
	
	@Override
	public void write() {
		System.out.println("File:: DEBUG");
	}

}
