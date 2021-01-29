package backjoon.array.demension1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Max {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));

		int max = 0;
		int index = 0;
		for(int i = 1; i < 10; i++) {
			int tmp = Integer.parseInt(bfReader.readLine());
			if(tmp > max) {
				max = tmp;
				index = i;
			}
		}
		
		BufferedWriter bfWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		bfWriter.write(String.valueOf(max) + "\n" + String.valueOf(index));
		bfWriter.flush();
		bfWriter.close();
	}

}
