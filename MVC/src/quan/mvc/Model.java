package quan.mvc;

public class Model {
	public UserObject[] findAllUser() {
		UserObject[] users = new UserObject[2];
		users[0] = new UserObject("Quan", 24, "Tan Cuong");
		users[1] = new UserObject("Duy", 23, "TT Vinh Tuong");
		
		return users;
	}
}
