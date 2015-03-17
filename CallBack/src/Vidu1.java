public class Vidu1 implements Calculator.Calculation{

	public void getResult1(int n) {
		System.out.println("report1:"+n);	
	}
	
	public void getResult2(int n) {
			
	}
	
	public void report() {
		Calculator calculator = new Calculator();
		calculator.attach(new Vidu1());
		calculator.run();
	}
}
