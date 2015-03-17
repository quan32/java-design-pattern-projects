package quan.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class MalePerson implements Criteria{

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		final List<Person> list = new ArrayList<Person>();
		
		for (final Person person : persons) {
			if(person.getSex().equalsIgnoreCase("Male")) {
				list.add(person);
			}
		}
		
		return list;
	}

}
