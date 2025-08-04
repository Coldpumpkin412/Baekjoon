import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			int N = Integer.parseInt(br.readLine());
			int M = -1 * N; 
			
			if((N&M) == N) { 
				sb.append(1);
			}else {
				sb.append(0);
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
}