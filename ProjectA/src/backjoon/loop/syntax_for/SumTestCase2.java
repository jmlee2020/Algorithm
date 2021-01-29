package backjoon.loop.syntax_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SumTestCase2 {

	public static void main(String[] args) throws IOException {

		BufferedReader bfRead = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfWrite = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bfRead.readLine());
		
		for(int i = 1; i <= n; i++) {
			String[] numbers = bfRead.readLine().split(" ");

			int number1 = Integer.parseInt(numbers[0]);
			int number2 = Integer.parseInt(numbers[1]);
			int sum = number1+number2;
			String result = "Case #" + i + ": " + number1 + " + " + number2 + " = " + sum + "\n"; 
			bfWrite.write(result);
			bfWrite.flush();
			//System.out.println(result);
		}
		
		bfRead.close();
		bfWrite.close();
	}

}
