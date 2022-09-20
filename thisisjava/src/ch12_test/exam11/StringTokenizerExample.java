package ch12_test.exam11;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		
		String str1 = "아이디,이름,패스워드";
		StringTokenizer st = new StringTokenizer(str1,",");
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
