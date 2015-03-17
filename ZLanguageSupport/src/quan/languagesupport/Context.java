package quan.languagesupport;

public class Context {
	private Language language;
	
	public Context(Language language) {
		this.language = language;
	}
	
	public String get(String key) {
		return this.language.get(key);
	}
}
