package quan.commandpattern;

import quan.commandpattern.Person.PersonOrder;

public class BuyStock implements Order{
	private PersonOrder personOrder;
	
	public BuyStock(PersonOrder personOrder) {
		this.personOrder = personOrder;
	}
	@Override
	public void execute() {
		personOrder.buy();
	}

}
