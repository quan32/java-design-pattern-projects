package quan.commandpattern.test;

import quan.commandpattern.Agent;
import quan.commandpattern.BuyStock;
import quan.commandpattern.Person;
import quan.commandpattern.SellStock;

public class CommandPatternDemo {
	public static void main(String[] args) {
		
		//request side
		Person requester = new Person();
		requester.setPersonOrder(new Person.PersonOrder());
		
		//receiver side
		Agent agent = new Agent();
		
		//requester send order, receiver receive order
		//Buy order
		agent.takeOrder(new BuyStock(requester.getPersonOrder()));
		//Sell order
		agent.takeOrder(new SellStock(requester.getPersonOrder()));
		
		//Handle request
		while(!agent.isOrderEmpty()) {
			agent.executeOrder();
		}
	}
}
