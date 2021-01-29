package backjoon.loop.syntax_for;

import java.util.Scanner;

public class TotalSum {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i<=num; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}

}
