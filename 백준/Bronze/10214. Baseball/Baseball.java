import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			int Y = 0;
			int K = 0;
            
			for(int i=0 ; i<9 ; i++) {
				st = new StringTokenizer(br.readLine());
				Y += Integer.parseInt(st.nextToken());
				K += Integer.parseInt(st.nextToken());
			}
            
			if(Y > K) {
				System.out.println("Yonsei");
			}else if(K > Y) {
				System.out.println("Korea");
			}else {
				System.out.println("Draw");
			}
		}
	}

}