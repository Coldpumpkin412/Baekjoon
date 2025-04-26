import java.util.*;
import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
            
			int count = 0;
            
			for(int i=1 ; i<N ; i++) {
				for(int j=i+1 ; j<N ; j++) {
					
					if(((i*i) + (j*j) + M) % (i*j) == 0) {
						count++;
					}
				}
			}
            
			System.out.println(count);
		}
	}

}