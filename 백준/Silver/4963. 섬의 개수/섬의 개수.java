import java.util.*;

public class Main {
	static int[][] map;
	static boolean visited[][];
	
	//맵의 크기
	static int width, height;
	
	//x,y에 대한 방향변수
	static int[] dirX = {0,0,-1,1,-1,1,-1,1};
	static int[] dirY = {-1,1,0,0,1,1,-1,-1};
	
	//DFS함수
	public static void DFS(int x, int y) {
		//현재노드 방문처리
		visited[x][y] = true;
		
		//상,하,좌.우.대각선 8방향에 대한 값
		for(int i=0 ; i<8 ; i++) {
			//다음 노드
			int nowX = x + dirX[i];
			int nowY = y + dirY[i];
			
			//다음 노드가 맵의 범위를 벗어나지않고, 방문한 적이 없으며, 땅(1)인 경우 DFS재귀적 실행
			if(nowX>=0 && nowX<height && nowY>=0 && nowY<width && !visited[nowX][nowY] && map[nowX][nowY]==1) {
				DFS(nowX,nowY);
			}
		}
	}
	
	public static void main(String[] args) {
		/*
		 * DFS 활용
		 */
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int answer = 0;
			
			width = sc.nextInt();
			height = sc.nextInt();
			
			//입력이 둘 다 0인 경우 종료
			if(width==0 && height==0) return;
			
			//테스트케이스에 대한 맵 및 방문처리 배열 선언
			map = new int[height][width];
			visited = new boolean[height][width];
			
			//맵에 대한 정보 입력
			for(int i=0 ; i<height; i++) {
				for(int j=0 ; j<width ; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			for(int i=0 ; i<height ; i++) {
				for(int j=0 ; j<width ; j++) {
					//방문한 적이 없으며 땅이 있는 곳인경우 DFS실행 및 answer++
					if(!visited[i][j] && map[i][j]==1) {
						DFS(i,j);
						answer++;
					}
				}
			}
			
			System.out.println(answer);
		}
		
	}
}

	
