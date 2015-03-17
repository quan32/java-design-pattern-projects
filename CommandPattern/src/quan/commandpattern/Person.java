package quan.commandpattern;

public class Person {
	private PersonOrder personOrder;
	
	public Person() {
		this.personOrder = new PersonOrder();
	}

	public PersonOrder getPersonOrder() {
		return personOrder;
	}

	public void setPersonOrder(PersonOrder personOrder) {
		this.personOrder = personOrder;
	}
	
	public static class PersonOrder {
		private String name;
		private int quantity;
		
		public PersonOrder() {
			this.name = "Altplus";
			this.quantity = 100;
		}
		
		public void buy() {
			System.out.println("Buy::"+"[name="+name+", quantity="+quantity+"]");
		}
		
		public void sell() {
			System.out.println("Sell::"+"[name="+name+", quantity="+quantity+"]");
		}
	}

}

