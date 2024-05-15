import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
		int N = Integer.parseInt(br.readLine());
		int[] growth = new int[N];
        
		Long answer = 0L;
        
        st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			answer += Long.parseLong(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			growth[i] = Integer.parseInt(st.nextToken());
		}
        
        //오름차순 정렬
		Arrays.sort(growth);
        
		for(int i=0 ; i<N ; i++) {
			answer += growth[i]*i;
		}
        
		System.out.println(answer);
 	}	
}