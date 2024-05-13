import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st;
        
        //쿼리 개수 M 입력
		int M = Integer.parseInt(bf.readLine());

		long sum = 0;
		long xor = 0;

		while(M-->0) {
			st = new StringTokenizer(bf.readLine());
			int index = Integer.parseInt(st.nextToken());

			if(index == 1) {
				int x = Integer.parseInt(st.nextToken());
                
				sum += x;
				xor = xor ^ x;
			}else if(index == 2) {
				int x = Integer.parseInt(st.nextToken());
                
				sum -= x;
				xor = xor ^ x;
			}else if(index == 3) {
                System.out.println(sum);				
			}else {
				System.out.println(xor);
			}
		}
	}
}