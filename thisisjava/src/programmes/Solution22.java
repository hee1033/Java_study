package programmes;

public class Solution22 {

	public static void main(String[] args) {
		
		int[] absolutes = new int[] {4,7,12};
		boolean[] signs = new boolean[]	{true,false,true};
		
		int sum =0;
		
		for(int i=0;i<absolutes.length;i++) {
			if(signs[i] == true) {
				sum += absolutes[i];
			}else {
				sum -= absolutes[i];
			}
		}
		System.out.println(sum);
	}

}
