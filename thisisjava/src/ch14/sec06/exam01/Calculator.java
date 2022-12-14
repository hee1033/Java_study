package ch14.sec06.exam01;

public class Calculator/*공유객체 */{
	
	//필드
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	/*동기화 메소드*/
	public synchronized void setMemory1(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName()+" : "+this.memory);
	}
	
	public void setMemory2(int memory) {
		synchronized (this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
			}
			System.out.println(Thread.currentThread().getName()+" : "+this.memory);
		}
	}
}
