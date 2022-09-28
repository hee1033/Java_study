package programmes;

public class Solution28 {

	public static void main(String[] args) {
		
		int price =3;
		int money = 40;
		int count = 4;
		int result = 0;
		
		int sum = 0;
		
		for(int i=1;i<=count;i++) {
			sum += price*i;
		}
		
		result = sum - money;
		
		if(result<0) {
			result = 0;
		}else {
			result = result;
		}
		System.out.println(result);
	}

}
