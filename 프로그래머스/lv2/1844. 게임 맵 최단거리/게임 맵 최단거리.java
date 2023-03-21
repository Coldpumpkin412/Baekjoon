import java.util.*;

class Solution {
    //방문처리용 배열
	static boolean[][] visited;
	
	//좌표이동에 활용될 변수
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
    
    public int solution(int[][] maps) {
        //BFS에 활용될 큐 선언
		Queue<int[]> queue = new LinkedList<>();
		
		//맵의 가로세로 크기
		int rowSize = maps.length;
		int colSize = maps[0].length;
		
		//방문처리용 배열 선언
		visited = new boolean[rowSize][colSize];
		
		//시작지점 방문처리 및 큐에 넣기
		visited[0][0] = true;
		queue.offer(new int[] {0,0});
		
		//큐가 빌 때까지 실행
		while(!queue.isEmpty()) {
			//큐의 헤드부분 뽑기
			int[] now = queue.poll();
			
			//현재좌표는 방금 추출한 헤드의 행과 열
			int now_Row = now[0];
			int now_Col = now[1];
			
			//동서남북으로 이동
			for(int i=0 ; i<4 ; i++) {
				//이동 후 좌표
				int next_Row = now_Row + dx[i];
				int next_Col = now_Col + dy[i];
				
				//이동 후 좌표가 맵의 영역을 벗어난 경우
				if(next_Row<0 || next_Row>=rowSize || next_Col<0 || next_Col>=colSize) continue;
				//좌표가 길이 아닌경우(map에서 0으로 표시된 구역) 혹은 방문한적이 있는경우
				if(maps[next_Row][next_Col]==0 || visited[next_Row][next_Col]) continue;
			
				//방문가능한 지점에 방문시 큐에 넣어주기 및 방문처리
				queue.offer(new int[] {next_Row,next_Col});
				visited[next_Row][next_Col] = true;
				
				//해당 인덱스에 대한 maps의 값(이동거리) +1 해주기
				maps[next_Row][next_Col] = maps[now_Row][now_Col] + 1;
			}
		}
		
		int answer;
		
		//상대팀진영에 도착할 수 없는 경우
		if(maps[rowSize-1][colSize-1] == 1) {
			answer = -1;
		}else {//아닌경우
			answer = maps[rowSize-1][colSize-1];
		}
		
		return answer;
    }
}