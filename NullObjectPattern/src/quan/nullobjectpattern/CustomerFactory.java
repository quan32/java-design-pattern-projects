package quan.nullobjectpattern;

import java.util.ArrayList;
import java.util.List;

public class CustomerFactory {
	private List<AbstractCustomer> customerList;
	public CustomerFactory() {
		customerList = new ArrayList<AbstractCustomer>();
	}
	
	public void builtList(int number) {
		for (int i = 0; i < number; i++) {
			customerList.add(new RealCustomer(generateRamdomString(3)));
		}
	}
	
	public String generateRamdomString(int n) {
		return "quan";
	}
	
	public AbstractCustomer getCustomer(int index) {
		if(index < customerList.size()) {
			return customerList.get(index);
		} else {
			return new NullCustomer();
		}
	}
}
