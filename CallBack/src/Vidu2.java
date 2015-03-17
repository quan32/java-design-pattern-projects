public class Vidu2 implements Calculator.Calculation{

	public void getResult1(int n) {
			
	}
	
	public void getResult2(int n) {
		System.out.println("report2:"+n);
	}
	
	public void report() {
		Calculator calculator = new Calculator();
		calculator.attach(new Vidu2());
		calculator.run();
	}
}
