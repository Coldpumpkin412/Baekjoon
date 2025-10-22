import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			st = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			
			if((n * s) < ((n * p) + d)) {
                sb.append("do not parallelize").append("\n");
            }else if((n * s) == ((n * p) + d)) {
                sb.append("does not matter").append("\n");
            }else {
                sb.append("parallelize").append("\n");
            }
		}
        
		System.out.println(sb.toString());
	}

}