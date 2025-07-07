import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			int sum = Integer.parseInt(br.readLine());
			int N = Integer.parseInt(br.readLine());
            
			for(int i=0 ; i<N ; i++) {
				st = new StringTokenizer(br.readLine());
				int q = Integer.parseInt(st.nextToken());
				int p = Integer.parseInt(st.nextToken());
				
				sum += (q * p);
			}
			System.out.println(sum);
		}
	}

}