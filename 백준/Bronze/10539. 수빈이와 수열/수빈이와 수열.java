import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //수열 B의 길이 N 입력
		int N = Integer.parseInt(br.readLine());
        
        //배열 선언
		int[] A = new int[N];
		int[] B = new int[N];

        //수열 B 값들 입력
        st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}

		int sum = 0;

		for(int i=0 ; i<N ; i++) {
			A[i] = B[i]*(i+1) - sum;
            
			sum += A[i];
		}
    
        //출력
		for(int i=0 ; i<N ; i++) {
			System.out.print(A[i] + " ");
		}
	}
}