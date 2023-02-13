class Solution {
    public int answer = 0;
	public boolean[] visited; //방문정보 저장 배열
	
	//완전탐색(DFS) 활용하여 풀기
	public void DFS(int count, int k, int[][] dungeons) {
		for(int i=0 ; i<dungeons.length ; i++) {
			//방문한 적이 없고 최소피로도가 k보다 작거나 같은경우
			if(!visited[i] && dungeons[i][0] <= k) {
				visited[i] = true; //방문처리
				DFS(count+1, k-dungeons[i][1], dungeons); //소모피로도를 뺀 값으로 k변경 후 재귀 호출
				visited[i] = false;
			}
		}
		
		answer = Math.max(answer, count); //최댓값 저장
	}
	public int solution(int k, int[][] dungeons) {
	
		visited = new boolean[dungeons.length]; //방문정보 저장 배열
		
		DFS(0, k, dungeons);
	
		return answer;
		
	}

}