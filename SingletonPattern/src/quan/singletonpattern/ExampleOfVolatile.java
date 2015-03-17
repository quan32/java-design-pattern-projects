package quan.singletonpattern;

public class ExampleOfVolatile {
	public long i=1, j=2, k=10;
	public boolean flag1= true, flag2=false;
	public ExampleOfVolatile() {
		new Thread(new Runnable(){
			public void run() {
				while(i<=99) {
					if(flag1) {
						System.out.println("i="+i);
						i +=2;
						
						k=10000000;
						while(k!=0) {
							k--;
						}
						flag1 = !flag1;
						flag2 = !flag2;
					}
					
					try{
						Thread.sleep(1);
					}
					catch (Exception e) {
						e.printStackTrace();
					}	
				}
			}
		}).start();
		
		new Thread(new Runnable(){
			public void run() {
				while(j<=100) {
					if(flag2) {
						System.out.println("j="+j);
						j +=2;
						
						k=1000000000;
						while(k!=0) {
							k--;
						}
						
						flag2 = !flag2;
						flag1 = !flag1;
					}
					
					try{
						Thread.sleep(1);
					}
					catch (Exception e) {
						e.printStackTrace();
					}	
				}
			}
		}).start();
	}
	
	public static void main(String[] args) {
		new ExampleOfVolatile();
	}
	
}
