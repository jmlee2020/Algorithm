package backjoon.loop.syntax_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleAddWhile2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));		
		String str;
		
		while((str = bfReader.readLine()) != null) {
			String[] numbers = str.split(" ");
			if("".equals(numbers[0])) break;
			int sum = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
			System.out.println(String.valueOf(sum));
		}
	
		bfReader.close();

	}

}
