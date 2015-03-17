package quan.proxypattern.test;

import quan.proxypattern.ProxyImage;

public class ProxyPatternDemo {
	public static void main(String[] args) {
		ProxyImage proxyImage = new ProxyImage();
		proxyImage.display("file1.png");
		proxyImage.display("file1.png");
		proxyImage.display("file2.png");
	}
}
