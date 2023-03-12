import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException{
		/*
		 * 플로이드워셜 알고리즘 활용.
		 * i에서 j로 바로 가는 경우가 있을 수 있고,
		 * i에서 k를 거쳐, k에서 j로 가는 경우가 있을 수 있다
		 * 
		 * 위 두가지의 경우 모두 1의 값을 할당해준다
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		
		//정점의 개수 N 입력 및 그래프 선언
		int N = Integer.parseInt(br.readLine());
		int[][] graph = new int[N][N];
		
		//그래프의 인접행렬 입력
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0 ; j<N ; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		//i->j 바로가는경우는 이미 1로 선언돼있으므로
		//i->k->j k를거쳐가는 경우만 확인
		for(int k=0 ; k<N ; k++) {
			for(int i=0 ; i<N ; i++) {
				for(int j=0 ; j<N ; j++) {
					if(graph[i][k]==1 && graph[k][j]==1) {
						//k를 거쳐 갈 수 있다면 1로 변환
						graph[i][j] = 1;
					}
				}
			}
		}
		
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<N ; j++) {
				sb.append(graph[i][j]).append(" ");
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}

	
