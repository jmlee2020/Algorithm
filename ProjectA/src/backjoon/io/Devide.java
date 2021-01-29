package backjoon.io;

import java.util.Scanner;

public class Devide {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextInt();
		double b = sc.nextInt();
		
		double div = 0;
		try {
			div = a/b;
			System.out.println(div);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
