package backjoon.array.demension1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Reality {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
		
		int c = Integer.parseInt(bfReader.readLine());
		StringTokenizer st;
		
		for(int i = 0; i < c; i++) {
			String line = bfReader.readLine();
			st =  new StringTokenizer(line, " ");
		
			int count = Integer.parseInt(st.nextToken());
			int[] score = new int[count];
			
			double total = 0;
			
			for(int j = 0; j < count; j++) {
				score[j] = Integer.parseInt(st.nextToken());
				total += score[j];
			}
			
			double avg = total/count;
			double aboveAvg = 0;
			
			for(int j = 0; j < count; j++) {
				if(score[j] > avg) {
					aboveAvg+=1;
				}
			}
			
			double result = aboveAvg / count * 100;
			System.out.println(String.format("%.3f%%", result));
		}
	}
}
