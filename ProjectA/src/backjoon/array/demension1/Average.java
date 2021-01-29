package backjoon.array.demension1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Average {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bfReader.readLine());
		
		double[] score = new double[n];
		double max = 0;
		
		String scoreString = bfReader.readLine();
		bfReader.close();
		
		StringTokenizer st = new StringTokenizer(scoreString, " ");
		
		for(int i = 0; st.hasMoreTokens(); i++) {
			score[i] = Integer.parseInt(st.nextToken());
			if(max < score[i]) {
				max = score[i];
			}
		}
				
		double total = 0;
		for(int i = 0; i < n; i++) {
			total += score[i] / max * 100;
		}
		
		
		System.out.println(total/n);
		
		

	}

}
 