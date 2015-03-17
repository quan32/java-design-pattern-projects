package quan.nullobjectpattern;

public class NullCustomer extends AbstractCustomer{

	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public String getName() {
		return "NULL VALUE";
	}

	@Override
	public void print() {
		System.out.println("NULL VALUE");
	}
}
