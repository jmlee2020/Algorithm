package backjoon.conditions;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int score = sc.nextInt();
		
		char result;
		
		if(score <= 100 && score >= 90) {
			result = 'A';
		} else if (score >= 80) {
			result = 'B';
		} else if (score >= 70) {
			result = 'C';
		} else if (score >= 60) {
			result = 'D';
		} else {
			result = 'F';
		}
		
		System.out.println(result);
	}

}
