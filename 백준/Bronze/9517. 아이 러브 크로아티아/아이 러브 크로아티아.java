import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
		int K = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
        
		int time = 0;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int T = Integer.parseInt(st.nextToken());
			String Z = st.nextToken();
			
			time += T;
			
			if(time > 210) {
                break;
            }
			
			if(Z.equals("T")) {
                K++;
            }
			
			if(K == 9) {
                K = 1;
            }
		}
		System.out.println(K);
	}
}