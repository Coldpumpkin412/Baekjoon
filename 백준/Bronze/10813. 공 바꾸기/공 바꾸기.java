import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		//바구니의 개수 N과 공을 바꿀 횟수 M 입력
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		//바구니를 나타낼 배열 선언(1~N까지 이므로 N+1까지 선언한다)
		int[] bucket = new int[N+1];
		
		//초기에는 바구니의 번호가 공의 번호이다
		for(int i=1 ; i<=N ; i++) {
			bucket[i] = i;
		}
		
		//바구니의 공을 서로 교환한다(M번)
		for(int i=0 ; i<M ; i++) {
			st = new StringTokenizer(br.readLine());
			
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			int tmp; //교환하는데 활용될 변수
			
			tmp = bucket[first];
			bucket[first] = bucket[second];
			bucket[second] = tmp;
			
		}
		
		//공의 번호 바구니 순서대로 출력
		for(int i=1 ; i<=N ; i++) {
			System.out.print(bucket[i]+" ");
		}
	}
}

	
