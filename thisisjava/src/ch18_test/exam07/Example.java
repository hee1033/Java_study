package ch18_test.exam07;

import java.io.BufferedReader;
import java.io.FileReader;

public class Example {

	public static void main(String[] args) throws Exception {
		
		String filePath = "C:\\Users\\KOSA\\git\\OTI_Project\\thisisjava\\src\\ch18\\sec02\\exam03\\WriteExample.java";
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		int rowNumber = 0;
		String rowData;
		while(true) {
			rowData = br.readLine();
			if(rowData == null) {
				break;
			}
			System.out.println(++rowNumber +" "+rowData);
		}
		br.close();
	}

}
