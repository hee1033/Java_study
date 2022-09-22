package ch14.sec09.exam01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class ExecutorServiceExample {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		
		ExecutorService threadPool = new ThreadPoolExecutor(
				3,
				100,
				120L,
				TimeUnit.SECONDS,
				new SynchronousQueue<Runnable>()
				);
		
		
		
		executorService.shutdown();

	}

}
