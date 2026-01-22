package strings.mutable.stringbuffer;

public class StringBufferThreadSafety {
	public static void main(String[] args) {

		// We use StringBuffer because we are about to use Threads
		StringBuffer sb = new StringBuffer();

		// Create Thread 1: Appends "A" 1000 times
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				sb.append("A");
			}
		});

		// Create Thread 2: Appends "B" 1000 times
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				sb.append("B");
			}
		});

		// Start both at the exact same time
		t1.start();
		t2.start();

		// Wait for them to finish
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// RESULT:
		// Because StringBuffer is synchronized, the length will ALWAYS be 2000.
		// If we used StringBuilder here, the length might be 1998 or 1950 (Data Loss
		// due to collision).
		System.out.println("Final Length: " + sb.length());
	}
}