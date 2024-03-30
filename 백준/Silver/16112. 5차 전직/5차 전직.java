import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        //N, K 입력
        st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		long[] arr = new long[N];
		
		long sum = 0;
        
        //정수 N개 입력
        st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			arr[i] = Long.parseLong(st.nextToken());
			
            //누적합
			sum += arr[i];
		}
		
		sum *= K;
		
        //오름차순 정렬
		Arrays.sort(arr);
		
		for(int i=0 ; i<K ; i++) {
			sum -= (arr[i]*(K-i));
		}
		
		System.out.println(sum);
	}

}
