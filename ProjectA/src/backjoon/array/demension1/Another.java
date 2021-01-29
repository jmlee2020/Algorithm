package backjoon.array.demension1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Another {

	public static void main(String[] args) throws IOException {

		BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
		
		int mod = 42;
		
		HashSet<Integer> hash = new HashSet<>();
		for(int i = 0; i< 10; i++) {
			int tmp = Integer.parseInt(bfReader.readLine()) % mod;
			hash.add(tmp);
		}
		
		System.out.println(hash.size());
		
		
	}

}
