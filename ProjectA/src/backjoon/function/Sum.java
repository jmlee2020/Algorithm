package backjoon.function;

public class Sum {

	public long sum(int[] a) {
		long ans = 0;
		for(int i = 0; i < a.length; i++) {
			ans += a[i];
		}
		return ans;
		
	}
	
	public static void main(String[] args) {

		int[] array = {1,2,3,4,5,6,7,8,9,10};
		Sum sum = new Sum();
		long result = sum.sum(array);
		System.out.println(result);

	}

	
}

