package ch19.sec06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class ParseJsonExample {

	public static void main(String[] args) throws IOException {
		
		//파일로부터 JSON 읽기
		BufferedReader br = new BufferedReader(
				new FileReader("C:/Temp/member.json",Charset.forName("UTF-8")));
		
		String json = br.readLine();
		br.close();
		
		//JSON 파싱
				
		
	}

}
