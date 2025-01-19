import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        //성냥개수 N, 가로길이 W, 세로길이 H 입력
        st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		
		for(int i=0 ; i<N ; i++) {
            //성냥길이 입력
			int len = Integer.parseInt(br.readLine());
			
			if(len <= W) {
				System.out.println("DA");
			}else if(len <= H) {
				System.out.println("DA");
			}else if(len <= Math.sqrt(Math.pow(W, 2) + Math.pow(H, 2))) {
				System.out.println("DA");
			}else {
				System.out.println("NE");
			}
		}
		
	}
}