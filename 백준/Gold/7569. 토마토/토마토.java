import java.util.*;

//토마토 클래스 생성
class Point{
	int x; //세로(행)
	int y; //가로(열)
	int z; //층수(높이)
	
	//생성자
	Point(int z, int x, int y){
		this.z = z;
		this.x = x;
		this.y = y;
	}
}

public class Main {
	
	//상자의 가로길이, 세로길이, 상자의 층 수
	static int M, N, H;
	
	//토마토상자 배열
	static int[][][] tomato;
	
	//방향변수
	static int[] dx = {-1,1,0,0,0,0};
	static int[] dy = {0,0,-1,1,0,0};
	static int[] dz = {0,0,0,0,-1,1};
	
	//BFS에 활용할 큐
	static Queue<Point> queue;
	
	//정답 변수 선언 및 초기화
	static int answer = Integer.MIN_VALUE;
	
	//BFS함수
	public static int BFS() {
		//큐가 빌 때 까지
		while(!queue.isEmpty()) {
			//현재 노드 추출 및 해당 노드에대한 높이, 행, 열 값
			Point now = queue.poll();
			int now_z = now.z;
			int now_x = now.x;
			int now_y = now.y;
			
			//방향변수 활용하여 6가지 방향노드 설정
			for(int i=0 ; i<6 ; i++) {
				int next_x = now_x + dx[i]; //세로(행)
				int next_y = now_y + dy[i]; //가로(열)
				int next_z = now_z + dz[i]; //높이
				
				//범위내를 만족하는경우
				if(next_x>=0 && next_x<N && next_y>=0 && next_y<M && next_z>=0 && next_z<H) {
					//토마토가 익지않은경우
					if(tomato[next_z][next_x][next_y] == 0) {
						//큐에 추가 후 값을 이전보다 1 증가
						queue.offer(new Point(next_z,next_x,next_y));
						tomato[next_z][next_x][next_y] = tomato[now_z][now_x][now_y] + 1;
					}
				}
			}
		}
		
		for(int i=0 ; i<H ; i++) {
			for(int j=0 ; j<N ; j++) {
				for(int k=0 ; k<M ; k++) {
					//토마토가 안익은게 있으면 -1 반환
					if(tomato[i][j][k] == 0) return -1;
					
					//아니라면 날짜의 최댓값 저장
					answer = Math.max(answer, tomato[i][j][k]);
				}
			}
		}
		
		
		//최댓값이 1이라는 의미는 애초에 모두 익은 상태인것을 의미하므로 0 출력
		if(answer == 1) {
			return 0;
		}else { //아닌경우 최댓값-1을 출력(첫 시작이 1이었기때문)
			return answer-1; 
		}
	}
	
	public static void main(String[] args){
		/*
		 * BFS 활용하여 풀기
		 * 익은 토마토 주변에 값은 이전값의 +1이 된다.
		 * 즉 값이 1인 곳을 기준으로 BFS 실행, 최종적으로 최댓값-1이 걸리는 날짜.
		 * 예외) 아직 익지않은 토마토가 있는경우 -1출력
		 * 예외2) 토마토가 모두 익은상태(1)로 시작한 경우 0 출력
		 */
		Scanner sc = new Scanner(System.in); 
		
		//큐 선언
		queue = new LinkedList<Point>();
		
		//가로길이(열), 세로길이(행), 층 수(높이) 입력
		M = sc.nextInt();
		N = sc.nextInt();
		H = sc.nextInt();
		
		//토마토상자 선언 및 값 입력
		tomato = new int[H][N][M];
		for(int i=0 ; i<H ; i++) {
			for(int j=0 ; j<N ; j++) {
				for(int k=0 ; k<M ; k++) {
					tomato[i][j][k] = sc.nextInt();
					
					//입력값이 1이라면 큐에 넣어주기
					if(tomato[i][j][k] == 1) {
						queue.add(new Point(i,j,k));
					}
				}
			}
		}
		
		//BFS함수 실행
		System.out.println(BFS());
	}
}	
