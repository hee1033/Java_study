package ch08.sec05;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		//인터페이스 변수 선언
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		
		//디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		System.out.println("현재불륨: "+ rc.getVoilume());
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(7);
		
		//디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		System.out.println("현재불륨: "+ rc.getVoilume());
	}

}
