
class Calculator {
	private boolean isRunnable = true;
	private int i=0;
	
	public interface Calculation{
		public void getResult1(int n);
		public void getResult2(int n);
	}
	public Calculation mCallback;
	
	public Calculator(){
		System.out.println("init");
	}
	
	public void attach(Calculation calculation) {
		mCallback = calculation;
		System.out.println("listened!");	
	}
	
	public void run() {
		System.out.println("run");
		new Thread(new Runnable() {
			
			public void run() {
				while(isRunnable){
					i++;
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					if(i%5 == 0) {
						mCallback.getResult1(i);
					}
					
					if(i%10 ==0) {
						mCallback.getResult2(i);
					}
				}
				
			}
		}).start();
	}
}
