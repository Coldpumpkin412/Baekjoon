class Solution {
	//방문처리용 배열
	static boolean[] visited;
	//정답변수
	static int answer = 0;
	
	//DFS함수
	public static void DFS(String begin, String target, String[] words, int count) {
		//타겟단어와 같아지면 함수종료
		if(begin.equals(target)) {
			answer = count;
			return;
		}
		
		for(int i=0 ; i<words.length ; i++) {
			//방문한적이 있다면 넘어가기
			if(visited[i]) continue;
			
			//같은 스펠링이 몇개인지 확인하는 변수
			int spell = 0;
			for(int j=0 ; j<words[i].length() ; j++) {
				//스펠링이 같을경우 spell 변수 증가
				if(words[i].charAt(j) == begin.charAt(j)) spell++;
			}
			
			//스펠링차이가 하나라면 방문처리 후 재귀적으로 DFS불러오기, 이 때 카운트도 증가
			if(spell == begin.length()-1) {
				visited[i] = true;
				
				DFS(words[i], target, words, count+1);
				
				//DFS함수가 종료되면 다시 방문처리 지워주기
				visited[i] = false;
			}
		}
	}
    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
		
		DFS(begin, target, words, 0);
		
		return answer;
    }
}