package backjoon.array.demension1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MinMax {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bfReader.readLine());
		
		int[] array = new int[n];
		
		StringTokenizer st = new StringTokenizer(bfReader.readLine(), " ");
		
		bfReader.close();
		
	
		for(int i = 0; i < n; i++) {
			array[i]= Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array);
		
		BufferedWriter bfWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		bfWriter.write(String.valueOf(array[0]) + " " + String.valueOf(array[n-1]));
		bfWriter.flush();
		bfWriter.close();
		

	}

}
