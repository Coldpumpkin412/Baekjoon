import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
		int max = 0;
		int sum = 0;
		
		for(int i=0 ; i<10 ; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
            
			sum = sum - N + M;
            
            max = Math.max(max, sum);
		}
        
		System.out.println(max);
	}
}