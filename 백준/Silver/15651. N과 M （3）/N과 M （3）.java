import java.util.*;
import java.io.*;

public class Main {
	static int N,M;
	static int[] arr;
	
	static StringBuilder sb = new StringBuilder(); 
	
	//DFS함수
	static void DFS(int N, int M, int depth) {
		if(depth == M) {
			for(int num : arr) sb.append(num).append(" ");
			
			sb.append("\n");
			return;
		}
		
		for(int i=0 ; i<N ; i++) {
			arr[depth] = i+1;
			
			DFS(N, M, depth+1);
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
		
		DFS(N, M, 0);
		
		System.out.print(sb);
	}
}	