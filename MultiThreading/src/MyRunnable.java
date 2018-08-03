
public class MyRunnable implements Runnable {
	
	private int data;
	@Override
	public void run() {
		
		String name = Thread.currentThread().getName(); //imp code
		for (int c = 1; c < 50; c++) {

			System.out.print(name + "\t " + ++data + "\t");
		}

	}
	
	public static void main(String[] args) throws InterruptedException {
		
		
		MyRunnable mr = new MyRunnable();
		Thread mt1 = new Thread(mr,"First");
		Thread mt2 = new Thread(mr,"Second");
		Thread mt3 = new Thread(mr,"Third");
		
		mt1.start();
		mt1.join();
		mt2.start();
		mt2.join();

		mt3.start();
	}

}
