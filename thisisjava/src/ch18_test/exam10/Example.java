package ch18_test.exam10;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {

	public static void main(String[] args) throws Exception {
		
		//원본 파일이 존재하지 않을 경우, "원본 파일이 존재하지 않습니다."를 출력할 것
		//복사 파일 경로에서 디렉토리가 존재하지 않으면 경로상의 모든 디렉토리를 생성할것 
		//복사가 성공되었을 떄 "복사가 성공되었습니다."를 출력할것
		
		try {
			String originalFileURL = "C:/Temp/dir1/photo1.jpg";
			Path originalFilePath = Paths.get(originalFileURL); 
			System.out.print("원본 파일 경로 : "+originalFilePath);
			System.out.println();
			
			String targetFileURL = "C:/Temp/dir2/photo2.jpg";
			Path targetFilePath =Paths.get(targetFileURL);  
			System.out.print("복사 파일 경로 : "+targetFilePath);
			System.out.println();
			
			File originalFile = new File(originalFileURL);
			if(!originalFile.exists()) {
				System.out.println("원본 파일이 존재하지 않습니다.");
				System.exit(0);
			}
			
			File targetFile = new File(targetFileURL);
			File parentFile = targetFile.getParentFile();
			if(!parentFile.exists()) {
				parentFile.mkdirs();
			}
			
			/*
			//입출력 스트림 얻기
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(originalFilePath));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFilePath));
			
			//파일 데이터를 읽고 출력하기
			byte[] data = new byte[1024];
			int num = -1;
			while(true) {
			num = bis.read(data);
			if(num == -1) break;
			bos.write(data, 0, num);
			}
			System.out.println("복사가 성공되었습니다.");
			
			//입출력 스트림 닫기
			bis.close();
			bos.close();
			*/
			
			Files.copy(originalFilePath,targetFilePath);
			
			
		}catch(Exception e) {
			e.getStackTrace();
		}
		
		
		
		
		

	}

}
