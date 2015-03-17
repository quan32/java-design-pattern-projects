package quan.commandpattern;

import java.util.LinkedList;
import java.util.Queue;

public class Agent {
	private Queue<Order> orders;
	
	public Agent() {
		orders = new LinkedList<Order>();
	}
	
	public void takeOrder(Order order) {
		orders.add(order);
	}
	
	public void executeOrder() {
		if(!orders.isEmpty()) {
			Order order = orders.remove();
			order.execute();
		} else {
			System.out.println("No more order");
		}
		
	}
	
	public boolean isOrderEmpty() {
		return orders.isEmpty();
	}
}
