package quan.mvc;

public class Controller {
	private Template template;
	private Model model;
	
	public Controller(){
		
	}
	
	public void setModel(Model model) {
		this.model = model;
	}
	
	public Model getModel() {
		return this.model;
	}
	
	public void setTeample(Template template) {
		this.template = template;
	}
	
	public Template getTemplate() {
		return this.template;
	}
	
	public void render() {
		this.template.render();
	}
	
}
