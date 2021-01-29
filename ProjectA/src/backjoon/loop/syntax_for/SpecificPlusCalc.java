package backjoon.loop.syntax_for;

import java.util.Scanner;

public class SpecificPlusCalc {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int iteration = sc.nextInt();
		
		for(int i = 0; i < iteration; i++) {
			int number1 = sc.nextInt();
			int number2 = sc.nextInt();
			
			System.out.println(number1 + number2);
		}

	}

}
