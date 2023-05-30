import java.util.*;
import java.io.*;

public class Main {
	static int N,M;
	static int[] arr;
	
	static StringBuilder sb = new StringBuilder(); 
	
	//DFS함수
	static void DFS(int N, int M, int index, int depth) {
		//노드의 깊이(depth)가 주어진 기준(M)과 같다면
		if(depth == M) {
			//저장된 배열들 저장
			for(int num : arr) sb.append(num).append(" ");
			
			//개행 후 함수종료
			sb.append("\n");
			return;
		}
		
		for(int i=index ; i<=N ; i++) {
			arr[depth] = i;
			
			//재귀적호출시 깊이(depth)와 인덱스를 하나 늘려준다
			DFS(N, M, i+1, depth+1);
			
		}
	}
	
	public static void main(String[] args) throws IOException{
		//백트래킹 사용 : 해당 노드가 유망하지 않은 노드일 때 부모 노드로 돌아간다. 기본적으로 재귀 및 DFS활용
		//n과m(1)과의 차이점 : 출력되는 수열은 오름차순이어야한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		
		DFS(N, M, 1, 0);
		
		System.out.print(sb);
	}
}	