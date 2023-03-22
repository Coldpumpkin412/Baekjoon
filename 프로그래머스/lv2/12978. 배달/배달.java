import java.util.*;

class Solution {
    //최댓값에 쓰일 변수
	public static final int INF = (int)1e9; 
	
    public int solution(int N, int[][] road, int K) {
        /*
		 * 플로이드워셜 알고리즘 활용
		 */
		int answer=0;
		
		//간선 및 가중치를 확인할 그래프
		int[][] graph = new int[N+1][N+1];
		
		//그래프 초기화 및 자기자신에게 가는 비용(거리)=0
		for(int i=0 ; i<=N ; i++) {
			//최댓값으로 초기화
			Arrays.fill(graph[i], INF);
			graph[i][i] = 0;
		}
		
		//각 간선에 대한 값 입력
		for(int i=0 ; i<road.length ; i++) {
			//같은 간선에 대해 중복으로 가중치가 부여될 수 있기 때문에 최솟값을 선언
			graph[road[i][0]][road[i][1]] = graph[road[i][1]][road[i][0]] = Math.min(graph[road[i][0]][road[i][1]], road[i][2]);
		}
		
		//플로이드워셜 알고리즘 수행
		for(int k=1 ; k<=N ; k++) {
			for(int a=1 ; a<=N ; a++) {
				for(int b=1 ; b<=N ; b++) {
					//마을에서 마을까지 가는거리는 직접가는거리와 거쳐서가는 거리중 최솟값
					graph[a][b] = Math.min(graph[a][b], graph[a][k] + graph[k][b]);
				}
			}
		}
		
		for(int i=1 ; i<=N ; i++) {
			if(graph[1][i] <= K) answer++;
		}
		
		return answer;
    }
}