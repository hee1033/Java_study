package ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {

	public static void main(String[] args) throws IOException {
		
		String originalFileName = "C:/Temp/test.jpg";
		String targetFileName = "C:/Temp/test1.jpg";
		
		InputStream is = new FileInputStream(originalFileName);
		OutputStream os = new FileOutputStream(targetFileName);
		
		/*byte[] data = new byte[1024];
		while(true) {
			int num = is.read(data);
			if(num == -1) break;
			os.write(data,0,num);
		}*/
		is.transferTo(os); // java 9 부터 입력 스트림에서 출력 스트림으로 바이트를 복사하는 transferTo()메소드가 추가
		
		os.flush();
		os.close();
		is.close();
		
		System.out.println("복사 완료");

	}

}
