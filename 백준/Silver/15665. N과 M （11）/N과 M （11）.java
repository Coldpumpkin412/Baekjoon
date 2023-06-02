import java.util.*;
import java.io.*;

public class Main {
	static int N,M;
	static int[] arr;
	static int[] num;
	
	static StringBuilder sb = new StringBuilder();
	
	//DFS함수
	static void DFS(int N, int M, int depth) {
		if(depth == M) {
			for(int number : arr) sb.append(number).append(" ");
			
			sb.append("\n");
			return;
		}
		
		int check = 0;
		for(int i=0 ; i<N ; i++) {
			if(check!=num[i]) {
				check = num[i];
				
				arr[depth] = num[i];
				
				DFS(N, M, depth+1);
			}
			
		}
	}
	
	public static void main(String[] args) throws IOException{
		//백트래킹 사용 : 해당 노드가 유망하지 않은 노드일 때 부모 노드로 돌아간다. 기본적으로 재귀 및 DFS활용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		num = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num);
		
		DFS(N, M, 0);
		
		System.out.println(sb);
	}
}	
