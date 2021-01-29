package algorithm.sort;

import java.util.Arrays;
import java.util.Collections;

public class QuickSort {

	public static void main(String[] args) {

		long n = 12345L;
		
		int[] answer = {};
		
		int temp = (int)n;
		int size = 0;
		for(int i = 0; temp>=1; temp/=10) {
			size++;
		}
		
		temp = (int)n;
		answer = new int[size];
		
		System.out.println(temp);
		
		for(int i = 0; temp>=1; temp/=10) {
			answer[i] = temp%10;
			System.out.print(answer[i]);
		}
		System.out.println(answer[0]);

	}

}
