import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
        
		int N = Integer.parseInt(br.readLine()); 
		int sum = (N-1) * 8; 
		
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			sum += Integer.parseInt(st.nextToken());
		}
		
		sb.append(sum/24).append(" ").append(sum%24);
		
		System.out.println(sb.toString());
	}
}