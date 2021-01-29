package backjoon.array.demension1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OXQuiz {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bfReader.readLine());
		
		for(int i = 0; i < n; i++) {	
			int count = 0;
			int total = 0;
			for(byte value : bfReader.readLine().getBytes()) {
				if ('O' == value) {
					count += 1;
					total += count;
				} else { 
					count = 0;
				}
			}
			System.out.println(total);
			
			

		}

	}

}
