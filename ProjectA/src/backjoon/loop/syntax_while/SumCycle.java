package backjoon.loop.syntax_while;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SumCycle {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
		
		String n = bfReader.readLine();
		
		bfReader.close();
		
		if(n.length() < 10) { 
			n = "0" + n; 
		}
		
		int spare = Integer.parseInt(n);
		int tmp = spare;
		int count = 0;
		
		do {
						
			int num1 = tmp/10;
			int num2 = tmp%10;
			
			int result = num1+num2;
			
			tmp = (tmp%10 * 10) + (result % 10);
			
			count+=1;
			
		}while(spare != tmp);
		
		BufferedWriter bfWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		bfWriter.write(String.valueOf(count));
		bfWriter.flush();
		bfWriter.close();
	}

}
