import java.util.*;

class Solution {
    
    //DFS함수 
	public void DFS(int index, boolean[] visited, int[][] computers) {
		//방문처리
		visited[index] = true;
		
		for(int i=0; i<computers.length ; i++) {
			if(visited[i]==false && computers[index][i]==1) {
				//방문한적이 없고 1을 가지고있으면 재귀적으로 호출
				DFS(i, visited, computers);
			}
		}
				
	}
    public int solution(int n, int[][] computers) {
        int answer = 0;
		
		boolean[] visited = new boolean[n];
		
		for(int i=0 ; i<n ; i++) {
			//방문한적이 없는 노드면 방문횟수 증가 후 DFS함수 실행
			if(!visited[i]) {
				answer++;
				DFS(i, visited, computers);
			}
		}
		
		return answer;
    }
}