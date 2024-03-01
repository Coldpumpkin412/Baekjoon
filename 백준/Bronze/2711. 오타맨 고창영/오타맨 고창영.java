import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
		int T = Integer.parseInt(br.readLine());
				
		while(T-->0) {
			st = new StringTokenizer(br.readLine());
            
			int wrongNum = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
            
			sb.append(str);
            
			sb.deleteCharAt(wrongNum - 1);
            
			System.out.println(sb.toString());
			sb.delete(0, sb.length());
		}
	}
}