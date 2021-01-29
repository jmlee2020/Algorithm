package backjoon.array.demension1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberIndex {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = Integer.parseInt(bfReader.readLine());
		int num2 = Integer.parseInt(bfReader.readLine());
		int num3 = Integer.parseInt(bfReader.readLine());
		
		bfReader.close();
		
		int result = num1*num2*num3;
		
		int[] array = new int[10];
		int size = String.valueOf(result).length();
		
		for(int i = 0; i < size; i++) {
			int tmp = result%10;
			array[tmp] = array[tmp] + 1;
			result = result/10;
		}
		
		for(int i : array) {
			System.out.println(i);
		}

	}

}
