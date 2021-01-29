package backjoon.conditions;

import java.util.Scanner;

public class Alarm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		m -= 45;
		if(m < 0) {
			h -= 1;
			m = 60 - Math.abs(m);
		}
		if(h < 0) {
			h = 24 - Math.abs(h);
		}
		
		System.out.println(h + " " + m);

	}

}
