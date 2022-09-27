package ch16.sec02.exam02;

public class ButtonExample {

	public static void main(String[] args) {
		
		//Ok 버튼 객체 생성
		Button btnOk = new Button();
		
		btnOk.setClickListener(()->{
			System.out.println("Ok 버튼을 클릭 했습니다.");
		});
		
		//Ok 버튼 클릭하기
		btnOk.click();
		
		//Cancel 버튼 객체 생성
		Button btnCancel = new Button();
		
		btnCancel.setClickListener(()->{
			System.out.println("Cancel 버튼을 클릭 했습니다.");
		});
		
		//Cancel 버튼 클릭하기
		btnCancel.click();

	}

}
