package backjoon.loop.syntax_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FastPlus {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bfread = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfwriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int iteration = Integer.parseInt(bfread.readLine());
		
		int sum = 0;
		for(int i = 1; i<=iteration; i++) {
			String[] numbers = bfread.readLine().split(" ");
			
			int number1 = Integer.parseInt(numbers[0]);
			int number2 = Integer.parseInt(numbers[1]);
			
			sum = number1+number2;
			
			bfwriter.write(String.valueOf(sum)+"\n");
		}
		bfwriter.flush();
		bfwriter.close();
		bfread.close();
	}

}
