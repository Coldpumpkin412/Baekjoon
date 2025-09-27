import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			int N = Integer.parseInt(br.readLine());
            
			int sum_C = 0;
			double sum_G = 0;
			
			for(int i=0 ; i<N ; i++) {
				st = new StringTokenizer(br.readLine());
				int C = Integer.parseInt(st.nextToken());
				double G = Double.parseDouble(st.nextToken());
				
				sum_C += C;
				sum_G += (G * C);
			}
			
			System.out.println(sum_C + " " + String.format("%.1f", (sum_G / sum_C)));
		}
	}

}
