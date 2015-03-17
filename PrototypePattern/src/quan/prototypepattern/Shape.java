package quan.prototypepattern;

public abstract class Shape implements Cloneable{
	private int id;
	protected String type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public abstract void onDraw();

	public Object clone() {
		Object clone = null;
		
		try {
			clone = super.clone();
		} catch (Exception e) {
			
		}
		
		return clone;
	}
	
}
