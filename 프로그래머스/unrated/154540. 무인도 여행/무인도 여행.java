import java.util.*;

class Solution {
    //방향변수
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	
	//무인도 길이
	static int map_width;
	static int map_height;
	
	//방문처리배열
	static boolean[][] visited;
	
	//무인도 점수 저장변수
	static int sum = 0;;
	
	//맵을 char형 배열로 변경하여 저장할 배열
	static char[][] map_ch;
	
	//BFS함수
	public static void BFS(int row, int col, int idx) {
		
		//BFS에 활용할 큐
		Queue<int[]> queue = new LinkedList<>();
		
		//현재위치 방문처리 
		visited[row][col] = true;
		//큐에 초기값 넣어주기
		queue.offer(new int[] {row, col});
		
		//큐가 빌 때까지
		while(!queue.isEmpty()) {
			//현재노드 저장 후 제거
			int now_x = queue.peek()[0];
			int now_y = queue.peek()[1];
			queue.poll();
			
			//4방향 탐색
			for(int i=0 ; i<4 ; i++) {
				//다음노드
				int next_x = now_x + dx[i];
				int next_y = now_y + dy[i];
				
				//맵을 벗어나거나 방문한 적이 있는경우
				if(next_x<0 || next_y<0 || next_x>=map_height || next_y>=map_width || visited[next_x][next_y]) {
					continue;
				}
				
				//이동한 위치에 X가 아닌 숫자가 있다면
				if(map_ch[next_x][next_y]!='X') {
					//큐에 해당 값 넣어준 후 방문처리
					queue.offer(new int[] {next_x, next_y});
					visited[next_x][next_y] = true;
					
					//값 저장
					idx += map_ch[next_x][next_y]-'0';
				}
			}
			
			sum = idx;
		}
	}
    public int[] solution(String[] maps) {
        /*
		 * BFS활용하여 풀기		 
		 */
		
		//정답을 임시로 저장할 리스트 선언
		List<Integer> list = new ArrayList<>();
		
		//무인도 크기 할당
		map_height = maps.length;
		map_width = maps[0].length();
		
		//방문처리배열 크기할당
		visited = new boolean[map_height][map_width];
		
		//맵을 char형 배열에 할당
		map_ch = new char[map_height][map_width];
		for(int i=0 ; i<map_height ; i++) {
			map_ch[i] = maps[i].toCharArray();
		}
		
		//무인도 탐색 시작
		for(int i=0 ; i<map_height ; i++) {
			for(int j=0 ; j<map_width ; j++) {
				//X가 아니라 숫자일경우
				if(map_ch[i][j]!='X') {
					//임시저장변수 초기화
					sum = 0;
					
					//방문한적이 없다면
					if(!visited[i][j]) {
						sum = map_ch[i][j]-'0';
						
						//BFS함수
						BFS(i, j, sum);
					}
					
					//BFS이후 sum값이 0이 아니라면 리스트에 저장
					if(sum != 0) {
						list.add(sum);
					}
				}
			}
		}
		
		//정답변수
		int[] answer;
		
		//지낼 수 있는 무인도가 없다면 -1 출력
		if(list.isEmpty()) {
			answer = new int[1];
			answer[0] = -1;
		}else {
			answer = new int[list.size()];
			
			//리스트의 값들 배열에 넣어주기
			for(int i=0 ; i<list.size() ; i++) {
				answer[i] = list.get(i);
			}
			
			//오름차순 정렬
			Arrays.sort(answer);
		}
				
		return answer;
    }
}