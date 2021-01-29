package backjoon;

public class Main {

	public static void main(String[] args) {

		long n = 69346L;
		int[] answer = {};
		int length = (int)(Math.log10(n) + 1);
		
		answer = new int[length];
		
		for(int i = 0; i < length; i++) {
			answer[i] = (int)n%10;
			n = n/10;
		}

		for(int i : answer) 
			System.out.println(i);
		
	}

}
