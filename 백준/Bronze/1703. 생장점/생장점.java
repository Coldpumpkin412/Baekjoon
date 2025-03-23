import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
            
			int answer = 1;
			
			if(N == 0) {
				break;
			}
			
			for(int i=0 ; i<2*N ; i++) {
				int M = Integer.parseInt(st.nextToken());
                
				if(i%2 == 0) {
					answer *= M;
				}else {
					answer -= M;
				}
			}
            
			System.out.println(answer);
		}
	}

}