package ch14.sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		
		//작업1
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {				
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						
					}
					
				}
			}
		});
		thread.start();
		
		//작업2
		/*for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}*/
		
		Thread thread2 = new Thread(new Task());
		thread2.start();
	}

}
