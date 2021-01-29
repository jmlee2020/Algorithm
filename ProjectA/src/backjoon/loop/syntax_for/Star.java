package backjoon.loop.syntax_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Star {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bfReader.readLine());
		
		bfReader.close();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < i; j++) {
				bfWriter.write("*");
			}
			bfWriter.write("\n");
		}
		bfWriter.flush();
		bfWriter.close();

	}

}
