import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int T = Integer.parseInt(br.readLine());	
        
		while(T-->0) {
			int N = Integer.parseInt(br.readLine());
            
			int max = N;
            
			while(N != 1) {
				N = (N%2==0) ? N/2 : (3*N)+1;
                
				max = Math.max(max, N);
			}
            
			System.out.println(max);
		}
        
	}
}