import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
		int N = Integer.parseInt(br.readLine());
        
		int count_A = 100;
		int count_B = 100;
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(A > B) {
				count_B -= A;
			}else if(A < B) {
				count_A -= B;
			}
		}
		System.out.println(count_A + "\n" + count_B);
	}

}