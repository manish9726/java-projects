
public class MyThread extends Thread {

	private int data;

	public MyThread(String name) {

	super(name);
	}

	
	
	@Override
	public void run() {
		
		String name = currentThread().getName(); //imp code
		for (int c = 1; c < 50; c++) {

			System.out.print(name + "\t " + ++data + "\t");
		}

	}

	public static void main(String[] args) throws InterruptedException {
		MyThread mt1 = new MyThread("First");
		MyThread mt2 = new MyThread("Second");
		MyThread mt3 = new MyThread("Third");

		mt1.start();
		//mt1.join();
		mt2.start();
		//mt2.join();

		mt3.start();
		
		String name = currentThread().getName(); //imp code
		for (int c = 1; c < 50; c++) {

			System.out.print(name + "\t " + c + "\t");
		
	}

}}

