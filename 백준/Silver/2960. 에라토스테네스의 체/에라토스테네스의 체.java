import java.util.*;
import java.io.*;

public class Main {
	
	public static int Eratosthenes(int N, int K) {
		//몇번째 지워진 수인지 체크 하는 변수
		int count = 0;
		
		//방문처리용
		boolean[] visited = new boolean[N+1];
		
		for(int i=2 ; i<=N ; i++) {
			for(int j=i ; j<=N ; j+=i) {
				//방문한적이 없다면(지워진 적이 없다면) 방문처리(지운것을 의미) 후 카운트 올리기
				if(!visited[j]) {
					count++;
					visited[j] = true;
				}
				
				//K번째로 지워졌다면 해당 숫자 출력
				if(count == K) return j;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) throws IOException{
		//에라토스테네스의 체 구현
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//N,K 입력
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		System.out.println(Eratosthenes(N, K));
		
	}
}

	
