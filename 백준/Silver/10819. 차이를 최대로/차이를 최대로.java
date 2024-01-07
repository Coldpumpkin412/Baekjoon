import java.util.*;
import java.io.*;

public class Main {
	static int N;
	static int[] arr;
	
	//임시 저장배열
	static int[] number;	
	
	//방문처리 배열
	static boolean[] visited;
	
	//정답변수
	static int answer = 0;;
	
	
	//DFS함수
	public static void DFS(int depth) {
		//depth(임시저장배열)의 크기가 N과 같아지는 경우
		if(depth == N) {
			//절댓값 차이 누적합 변수 선언
			int sum = 0;
			
			//인접배열간 절댓값 차이 더해주기
			for(int i=0 ; i<N-1 ; i++) {
				sum += Math.abs(number[i]-number[i+1]);
			}
			
			//최댓값 저장
			answer = Math.max(answer, sum);
		}
		
		//depth가 N보다 작은경우(다른경우)
		for(int i=0 ; i<N ; i++) {
			//해당배열 인덱스에 방문한적이 없다면
			if(!visited[i]) {
				//방문처리 후 임시저장배열에 값 할당
				visited[i] = true;
				number[depth] = arr[i];
				
				//depth 증가 후 재귀호출
				DFS(depth+1);
				
				//방문처리 취소
				visited[i] = false;
			}
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	/*백트래킹 활용하여 풀기*/
    	
    	//N 입력 및 배열 크기선언
    	N = Integer.parseInt(br.readLine());
    	arr = new int[N];
    	number = new int[N];
    	
    	//배열값 입력
    	st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	//방문처리배열 선언
    	visited = new boolean[N];
    	
    	//DFS함수 실행
    	DFS(0);
    	
    	System.out.println(answer);
    }
}	
