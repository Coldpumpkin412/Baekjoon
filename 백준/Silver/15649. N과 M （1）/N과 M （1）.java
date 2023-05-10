import java.util.*;
import java.io.*;

public class Main {
	//정답을 저장할 배열 및 방문처리용 배열 선언
	static int[] number;
	static boolean[] visited;
	
	static StringBuilder sb = new StringBuilder();
	
	//DFS함수 실행(깊이를 위해 depth변수 추가)
	public static void DFS(int N, int M, int depth) {
		//노드의 깊이가 주어진 기준(M)과 같다면
		if(depth == M) {
			//여태까지 저장된 배열 출력
			for(int num : number) sb.append(num).append(" ");	
			
			//개행 후 함수 종료
			sb.append("\n");
			return;
		}
		
		//N까지의 숫자를 모두 실행
		for(int i=0 ; i<N ; i++) {
			//방문한적이 없다면
			if(!visited[i]) {
				//방문처리
				visited[i] = true;
				
				//숫자 저장배열에 값 입력
				number[depth] = i+1;
				
				//재귀적 호출(depth는 1늘려 준다)
				DFS(N, M, depth+1);
				
				visited[i] = false;
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		/*
		 * DFS활용하여 풀기(백트래킹)
		 * -백트래킹 : 어떤 노드가 적합하지 않다면 부모 노드로 돌아가 다른 자식 노드를 탐색하는 것
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		number = new int[M];
		visited = new boolean[N];
		
		//DFS함수 실행
		DFS(N, M, 0);
		
		System.out.println(sb);
	}
}	
