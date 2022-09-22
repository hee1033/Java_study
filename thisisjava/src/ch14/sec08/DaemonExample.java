package ch14.sec08;

import java.util.Arrays;

public class DaemonExample {

	public static void main(String[] args) {
		
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
			
		}catch(InterruptedException e) {
			
		}
		autoSaveThread.interrupt();
		System.out.println("메인 스레드 종료");
		
		
	}

}
