package ch11.sec03.exam03;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		String[] array = { "100", "1oo" ,null,"200"};

		for (int i = 0; i <= array.length; i++) {

			try {
				System.out.println(array[i].length());
				int value = Integer.parseInt(array[i]);
			}  catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스 초과 : " + e.getMessage());
			}catch (NullPointerException | NumberFormatException e) {
				System.out.println("데이터 오류 : " + e.getMessage());
			}catch(Exception e) {
				System.out.println("예상치 못한 예외가 발생했습니다.");
			}

		}

	}

}
