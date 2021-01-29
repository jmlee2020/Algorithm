package backjoon.loop.syntax_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Numbers {

	public static void main(String[] args) throws IOException {

		BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] config = bfReader.readLine().split(" ");
		
		int n = Integer.parseInt(config[0]);
		int x = Integer.parseInt(config[1]);
		
		String[] array = bfReader.readLine().split(" ");
		int size = array.length;
		for(int i = 0; i < size; i++) {
			int tmp = Integer.parseInt(array[i]);
			if(tmp < x ) {
				bfWriter.append(tmp + " ");
			}
		}
		bfWriter.flush();
		
		bfReader.close();
		bfWriter.close();
		
	}

}
