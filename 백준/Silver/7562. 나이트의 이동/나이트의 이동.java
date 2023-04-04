import java.util.*;
import java.io.*;

public class Main {
	static int[][] map;
	static int length;
	
    //시작 및 목표지점
	static int startRow,startCol;
	static int finalRow, finalCol;
	
	//나이트 이동에 따른 방황변수
	static int[] dirX = {-1, -1, 1, 1, -2, -2, 2, 2};
	static int[] dirY = {-2, 2, -2, 2, -1, 1, -1, 1};
	
	//좌표를 표시할 클래스
	static class Point{
		int x,y;
		
		//생성자
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void BFS(int x, int y, int finalX, int finalY) {
		//BFS에 활용할 큐 선언
		Queue<Point> queue = new LinkedList<>();
		
		//현재노드값 = 0 으로 시작
		map[x][y] = 0;
		queue.add(new Point(x,y));
		
		//큐가 빌때까지
		while(!queue.isEmpty()) {
			//현재노드
			Point now = queue.poll();
			
			//만약 구하고자하는 위치라면 나오기
			if(now.x==finalX && now.y==finalY) break;
			
			//나이트가 이동할 수 있는 위치
			for(int i=0 ; i<8 ; i++) {
				//다음 위치
				int nextX = now.x + dirX[i];
				int nextY = now.y + dirY[i];
				
				//맵의 범위를 벗어나지 않고 방문한 적이 없는 경우 또는 최소한의 움직임인 경우
				if(0<=nextX && nextX<length && 0<=nextY && nextY<length && 
						(map[nextX][nextY]==0 || map[now.x][now.y]+1<map[nextX][nextY])) {
					
					//이동거리 1 증가한 값 최신화 및 큐에 넣어주기
					map[nextX][nextY] = map[now.x][now.y]+1;
					queue.add(new Point(nextX,nextY));
				}
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//테스트케이스 개수 입력
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) { 
			
			
			//체스판 한 변의 길이 입력 및 체스판 선언
			length = Integer.parseInt(br.readLine());
			map = new int[length][length];
			
			//나이트 현재 위치
			st = new StringTokenizer(br.readLine());
			startRow = Integer.parseInt(st.nextToken());
			startCol = Integer.parseInt(st.nextToken());
			
			//목표위치
			st = new StringTokenizer(br.readLine());
			finalRow = Integer.parseInt(st.nextToken());
			finalCol = Integer.parseInt(st.nextToken());
			
			//BFS함수
			BFS(startRow, startCol, finalRow, finalCol);
			
			//정답출력
			System.out.println(map[finalRow][finalCol]);
		}
	}
}

	
