package ch12.sec11.exam03;

public class GetResourceExample {

	public static void main(String[] args) {
		
		Class clazz = Car.class;
		
		String photo1Path = clazz.getResource("photo2.jpg").getPath();
		String photo2Path = clazz.getResource("images/flower_2.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);

	}

}
