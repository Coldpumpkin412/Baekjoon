import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
        //월세 내기 전 날 N, 일 할 수 있는 날 M 입력
        st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
        //일급 저장배열 T 선언
		long[] T = new long[N];
		
        //일급 입력
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			T[i]= Long.parseLong(st.nextToken());
		}
		
		long sum = 0;
        
        //일급 더해주기
		for(int i=0 ; i<M ; i++) {
			sum += T[i];
		}
		
		long answer = sum;
		for(int i=0 ; i+M<N ; i++) { 
			sum -= T[i];
			sum += T[M+i];
            
			answer = Math.max(answer, sum);
		}
		
		System.out.println(answer);		
	}
}