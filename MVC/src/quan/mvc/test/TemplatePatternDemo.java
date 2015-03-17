package quan.mvc.test;

import quan.mvc.Controller;
import quan.mvc.Model;
import quan.mvc.Template;

public class TemplatePatternDemo {
	public static void main(String[] args) {
		Controller controller = new Controller();
		controller.setModel(new Model());
		controller.setTeample(new Template());
		
		Object[] data = controller.getModel().findAllUser();
		controller.getTemplate().setData(data);
		controller.render();
	}
}
