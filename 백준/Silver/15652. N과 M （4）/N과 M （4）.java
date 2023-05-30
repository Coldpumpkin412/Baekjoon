import java.util.*;
import java.io.*;

public class Main {
	static int N,M;
	static int[] arr;
	
	static StringBuilder sb = new StringBuilder(); 
	
	//DFS함수
	static void DFS(int N, int M, int index, int depth) {
		if(depth == M) {
			for(int num : arr) sb.append(num).append(" ");
			
			sb.append("\n");
			return;
		}
		
		for(int i=index ; i<=N ; i++) {
			arr[depth] = i;
			
			DFS(N, M, i, depth+1);
		}
	}
	
	public static void main(String[] args) throws IOException{
		//백트래킹 사용 : 해당 노드가 유망하지 않은 노드일 때 부모 노드로 돌아간다. 기본적으로 재귀 및 DFS활용
		//n과m(3)과의 차이점 : 같은 수를 여러번 고르면서 비내림차순이어야한다(2와 3을 합친것)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		
		DFS(N, M, 1, 0);
		
		System.out.print(sb);
	}
}	
