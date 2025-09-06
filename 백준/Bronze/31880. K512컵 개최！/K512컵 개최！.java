import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); 
		int m = Integer.parseInt(st.nextToken());
		
		long now = 0;
        
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreElements()) {
			now += Integer.parseInt(st.nextToken());
		}
		
		int num = 0;
        
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreElements()) {
			num = Integer.parseInt(st.nextToken());
			
			if (num != 0) { 
				now *= num;
			}
		}
		
		System.out.print(Long.toString(now));
	}
}