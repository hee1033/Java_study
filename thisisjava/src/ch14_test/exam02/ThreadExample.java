package ch14_test.exam02;

public class ThreadExample {

	public static void main(String[] args) {
		
		Thread thread1 = new MovieThread();
		thread1.start();
		
		Thread thread2 = new Thread(MusicRunnable.currentThread());
		thread2.start();
	}

}
