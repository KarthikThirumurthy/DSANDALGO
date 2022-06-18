package multithreading;

public class DeadLock {

	
	public static void main(String[] args) {

		final String a = "resource1";
		final String b = "resource2";

		Thread t1 = new Thread() {
			public void run() {
				synchronized (a) {
					System.out.println(Thread.currentThread().getName() + " has locked resource a");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					synchronized (b) {
						System.out.println(Thread.currentThread().getName() + " has locked resource b");
					}
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				synchronized (b) {
					System.out.println(Thread.currentThread().getName() + " has locked resource b");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					synchronized (a) {
						System.out.println(Thread.currentThread().getName() + " has locked resource b");
					}
				}
			}
		};

		t1.start();
		t2.start();

	}
}
