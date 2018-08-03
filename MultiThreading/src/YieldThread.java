
public class YieldThread {

	static class HelloThread extends Thread {

		@Override
		public void run() {

			while (true) {
				System.out.println("Hello");
//			    try {
//					Thread.sleep(1);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}	
				
				yield();
			}

		}

	}

	static class WorldThread extends Thread {

		public void run() {

			while (true) {
				System.out.println("World");
//		    try {
//				Thread.sleep(1);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
				yield();
		    }	


		}

	}
	
	public static void main(String[] args) {
		HelloThread hello = new HelloThread();
		WorldThread world = new WorldThread();
		
		hello.start();
		world.start();
	}

}
