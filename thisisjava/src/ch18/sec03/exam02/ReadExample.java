package ch18.sec03.exam02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		
		try(InputStream is = new FileInputStream("C:/Temp/test2.db")){
			
			byte[] arr = new byte[100];
			
			while(true) {
				int num = is.read(arr);
				if(num == -1) break;
				
				for(int i=0;i<num;i++) {
					System.out.println(arr[i]);
				}
			}
		}catch(IOException e) {}

	}

}
