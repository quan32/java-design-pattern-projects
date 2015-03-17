package quan.commandpattern;

import quan.commandpattern.Person.PersonOrder;

public class SellStock implements Order{
	private PersonOrder personOrder;
	
	public SellStock(PersonOrder personOrder) {
		this.personOrder = personOrder;
	}
	@Override
	public void execute() {
		personOrder.sell();
	}

}
