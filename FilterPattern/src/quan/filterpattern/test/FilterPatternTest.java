package quan.filterpattern.test;

import java.util.ArrayList;
import java.util.List;

import quan.filterpattern.Criteria;
import quan.filterpattern.MalePerson;
import quan.filterpattern.Person;

public class FilterPatternTest {
	
	public static void main(String[] args) {
		List<Person> list;
		FilterPatternTest filterPatternTest = new FilterPatternTest();
		list = filterPatternTest.initList();
//		filterPatternTest.print(list);
		
		Criteria maleList = new MalePerson();
		list = maleList.meetCriteria(list);
		filterPatternTest.print(list);
		
		
	}
	
	public List<Person> initList() {	
		List<Person> list = new ArrayList<Person>();
		
		Person person1 = new Person(27, "male");
		list.add(person1);
		Person person2 = (Person)person1.clone();
		person2.setPerson(28, "female");
		list.add(person2);
		Person person3 = (Person)person1.clone();
		person3.setPerson(29, "male");
		list.add(person3);
		Person person4 = (Person)person1.clone();
		person4.setPerson(30, "female");
		list.add(person4);
		Person person5 = (Person)person1.clone();
		person5.setPerson(31, "male");
		list.add(person5);
			
		return list;
	}
	
	public void print(List<Person> list) {
		if(list.isEmpty()) {
			System.out.println("No person");
			return;
		} 
		
		for (final Person person : list) {
			System.out.println("["+person.getAge()+","+person.getSex()+"]");
		}
	}
}
