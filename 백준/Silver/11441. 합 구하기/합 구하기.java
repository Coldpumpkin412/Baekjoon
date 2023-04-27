import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		/*
		 * "인덱스 A ~ B 구간의 합 = 인덱스 0~B 구간의 합 - 인덱스 0 ~ (A-1) 구간의 합" 을 활용.
		 * 즉 배열이 주어졌을 때 인덱스 0부터 각 인덱스까지의 합을 저장하는 배열을 따로 선언한다
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		//숫자의 개수 N입력 및 배열 2개 선언
		int N = Integer.parseInt(br.readLine());
		
		int[] sum = new int[N+1];
		
		//배열 값 입력을 통해 누적합 배열 값 넣어주기
		st = new StringTokenizer(br.readLine());
		for(int i=1 ; i<=N ; i++) {
			sum[i] = sum[i-1] + Integer.parseInt(st.nextToken());
		}
		
		
		//구간의 수 M 입력
		int M = Integer.parseInt(br.readLine());
		while(M-->0) {
			//구간 입력
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			sb.append(sum[j]-sum[i-1]).append("\n");
		}
		
		System.out.println(sb);
		
	}
}

	
