package backjoon.loop.syntax_while;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SimpleAddWhile {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String[] numbers = bfReader.readLine().split(" ");
			
			int x = Integer.parseInt(numbers[0]);
			int y = Integer.parseInt(numbers[1]);
			
			if(x == 0 && y == 0) break;
			
			int sum = x + y;
			
			bfWriter.write(String.valueOf(sum)+"\n");
			bfWriter.flush();
		}
		
		bfReader.close();
		bfWriter.close();

	}

}
