package backjoon.io;

import java.util.Scanner;

public class MultipleSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();

		int length = (int)(Math.log10(b) + 1);

		int tmp = b;
		for(int i=0; i< length; i++) {
			int seq = tmp%10;
			System.out.println(a*seq);
			tmp /= 10;
		}
		System.out.println(a*b);
	}

}
