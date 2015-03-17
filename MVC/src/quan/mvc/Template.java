package quan.mvc;

public class Template {
	private Object[] data;
	public void initialize() {
		
	}
	
	public void render() {
		UserObject user;
		for (int i = 0; i < data.length; i++) {
			System.out.println("User "+(i+1));
			user = (UserObject)data[i];
			System.out.println("Name:"+user.getName());
			System.out.println("Age:"+user.getAge());
			System.out.println("Address:"+user.getAddress());
			System.out.println("-----------------");
		}
		
	}
	
	public void setData(Object[] data) {
		this.data = data;
	}
}
