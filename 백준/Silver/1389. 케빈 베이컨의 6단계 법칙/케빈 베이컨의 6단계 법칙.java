import java.util.*;
import java.io.*;

public class Main {
	public static final int INF = (int)1e9; //무한을 의미하는 값
	
	public static void main(String[] args) throws IOException{
		/*
		 * 임의의 모든 지점에서 다른 임의의 모든 지점까지 가는 거리의 최솟값
		 * 즉, 플로이드 워셜 알고리즘을 활용하여 풀기
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//유저의 수(노드의 수), 친구 관계의 수(간선의 수) 입력
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		//친구관계(간선)를 표기할 2차원배열 선언
		int[][] graph = new int[N+1][N+1];
		
		//모두 무한으로 초기화
		for(int i=0 ; i<=N ; i++) {
			Arrays.fill(graph[i], INF);
			
			//자기자신에 대한 비용(거리)는 0
			graph[i][i] = 0;
		}
		
		//친구 관계 입력
		for(int i=0 ; i<M ; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			//A에서 B로가는 비용, B에서 A로 가는 1
			graph[A][B] = graph[B][A] = 1;
		}
		
		//플로이드 워셜 알고리즘
		for(int k=1 ; k<=N ; k++) {
			for(int i=1 ; i<=N ; i++) {
				for(int j=1 ; j<=N ; j++) {
					//최단경로값 초기화
					graph[i][j] = Math.min(graph[i][j], graph[i][k]+graph[k][j]);
				}
			}
		}
		
		//케빈베이컨 수가 가장 작은 인덱스 찾기
		int sum = INF;
		int min_index = 0;
		
		for(int i=1 ; i<=N ; i++) {
			int kevin_sum=0;
			for(int j=1 ; j<=N ; j++) {
				kevin_sum += graph[i][j];
			}
			
			if(sum > kevin_sum) {
				sum = kevin_sum;
				min_index=i;
			}
		}
		
		System.out.println(min_index);
	}
}

	
