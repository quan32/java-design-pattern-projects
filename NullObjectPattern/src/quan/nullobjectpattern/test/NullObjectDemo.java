package quan.nullobjectpattern.test;

import quan.nullobjectpattern.AbstractCustomer;
import quan.nullobjectpattern.CustomerFactory;

public class NullObjectDemo {
	public static void main(String[] args) {
		CustomerFactory customerFactory = new CustomerFactory();
		customerFactory.builtList(5);
		
		for (int i = 0; i < 10; i++) {
			AbstractCustomer customer = customerFactory.getCustomer(i);
			customer.print();
		}
	}
}
