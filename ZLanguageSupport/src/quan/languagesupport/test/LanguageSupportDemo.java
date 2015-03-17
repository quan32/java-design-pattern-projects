package quan.languagesupport.test;

import quan.languagesupport.Context;
import quan.languagesupport.Japanese;

public class LanguageSupportDemo {
	public static void main(String[] args) {
		Context context = new Context(new Japanese());
		System.out.println(context.get("txt_welcome")+": Quan");
	}
}
