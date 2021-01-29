package backjoon.loop.syntax_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintNReverse {

	public static void main(String[] args) throws NumberFormatException, IOException {
		

		BufferedReader bfRead = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bfRead.readLine());
		
		bfRead.close();
		
		for(int i = n; i > 0; i--) {
			System.out.println(i);
		}

	}

}
