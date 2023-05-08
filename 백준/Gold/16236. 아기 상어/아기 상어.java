import java.util.*;

public class Main {
	//맵 선언
	static int[][] map;
	
	//방향변수
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	//아기상어의 위치
	static int[] position;
	
	//아기상어의 크기, 먹은 물고기 수, 움직인 거리
	static int size = 2;
	static int fish = 0;
	static int move = 0;
	
	public static void main(String[] args) {
		/*
		 * NxN 크기의 맵, 물고기 M마리, 아기상어 1마리(최초 크기 : 2)
		 * 아기상어는 1초에 상하좌우 한 칸씩 이동, 자신보다 크기가 큰 물고기가 있는곳은 갈 수 없음
		 * 아기상어는 자신보다 작은 크기의 물고기만 먹을 수 있다.(크기가 같으면 지나갈 수 있지만 먹을 수 없음)
		 * 
		 * <아기상어 이동방법>
		 * 1. 먹을 수 있는 물고기가 1마리라면 그곳으로 이동.
		 * 2. 먹을 수 있는 물고기가 2마리 이상이면 가장 가까운곳으로 이동(위쪽, 왼쪽 우선)
		 * 
		 * 아기상어의 이동은 1초, 물고기를 먹으면 빈 칸이 된다.
		 * 아기상어는 자신의 크기와 같은 수의 물고기를 먹을 때 마다 크기 +1
		 * 
		 * 먹을 수 있는 물고기가 없을때까지 몇마리를 먹을 수 있는가?
		 * 
		 * *****2번 기준으로 인해 우선순위를 활용한 BFS가 필요*****
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//맵 크기 입력 및 선언
		int N = sc.nextInt();
		map = new int[N][N];
		
		//맵의 값 입력(9가 입력될시 아기상어 위치 저장)
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<N ; j++) {
				map[i][j] = sc.nextInt();
				
				//위치 좌표 저장 및 해당 값 0으로 초기화
				if(map[i][j] == 9) {
					position = new int[] {i,j};
					map[i][j] = 0;
				}
			}
		}
		
		while(true) {
			//y좌표, x좌표, 움직인 거리 활용하여 큐에 넣어주기
			PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) ->
            								o1[2] != o2[2] ? Integer.compare(o1[2], o2[2]) : (o1[0] != o2[0] ? Integer.compare(o1[0], o2[0]) : Integer.compare(o1[1], o2[1]))
										);
			
			//아기상어가 먹이 먹었는지 확인하는 변수
			boolean check = false;
			
			//방문처리 배열
			boolean[][] visited = new boolean[N][N];
			
			//초기값 큐에 넣어준 후 방문처리
			queue.offer(new int[] {position[0], position[1], 0});
			visited[position[0]][position[1]] = true;
			
			
			//큐가 빌 때까지
			while(!queue.isEmpty()) {
				//현재노드
				position = queue.poll();
				
				//먹이가 있으면서 상어의 사이즈보다 작다면?
				if (map[position[0]][position[1]]!=0 && map[position[0]][position[1]]<size) {
					 
					//물고기 먹기
					map[position[0]][position[1]] = 0; 
	                fish++; 
	                
	                //움직인 거리 더해주기
	                move += position[2]; 
	                check = true; // 먹이 먹었다고 체크
	                break;
				}
				
				//상하좌우 이동
				for (int i=0; i<4; i++) {
					//이동 후 좌표
                    int ny = position[0] + dy[i];
                    int nx = position[1] + dx[i];
                    
                    //맵을 벗어나거나 방문한 적이 있는경우
                    if (ny<0 || nx<0 || nx>=N || ny>=N || visited[ny][nx] || map[ny][nx] > size)
                        continue;
                    
                    //큐에 넣어주면서 이동거리 증가
                    queue.offer(new int[]{ny, nx, position[2] + 1});
                    visited[ny][nx] = true;
                }
			}
			
			//더이상 먹을 물고기가 없을경우 무한루프에서 탈출
			if (!check)
                break;
			
			//상어의 크기와 먹은 물고기 수가 동일하면 크기 증가 후 초기화
            if (size == fish) { 
                size++;
                fish = 0;
            }
		}
		
		System.out.println(move);
	}
}	
