package quan.languagesupport;
import java.util.HashMap;

public abstract class Language {
	protected String language;
	protected HashMap<String, String> data;
	protected DBOperation dbOperation;
	
	public Language() {
		setLanguage();
		dbOperation = new DBOperation(this.language);
		dbOperation.initDB();
		data = dbOperation.getData();
	}
	
	public abstract void setLanguage();
	
	public HashMap<String, String> getData() {
		return data;
	}
	
	public String get(String key) {
		String value = "";
		value = data.get(key);
		
		if(value !=null)
			return data.get(key);
		else
			return "";
	}
}
