import java.util.*;
import java.io.*;

//행, 열 좌표 클래스
class Node{
	int row;
	int col;
	
	public Node(int row, int col){
		this.row = row;
		this.col = col;
	}
}

public class Main {
	
	//통로(맵)의 세로길이 및 가로길이
	static int N;
	static int M;
	
	//통로 배열
	static char[][] map;
	
	//방문처리배열
	static boolean[][] visited;
	
	//방향변수
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	static int BFS(int row, int col) {
		int count = 1;
		
		//활용할 큐 선언
		Queue<Node> queue = new LinkedList<>();
		
		//초기값
		queue.offer(new Node(row, col));
		
		//방문처리
		visited[row][col] = true;
		
		//큐가 빌 때까지
		while(!queue.isEmpty()) {
			//현재노드
			Node now = queue.poll();
			
			//4가지방향에 대해
			for(int i=0 ; i<4 ; i++) {
				//다음 노드의 좌표
				int next_row = now.row + dx[i];
				int next_col = now.col + dy[i];
				
				//다음노드의 좌표가 맵을 벗어거나 방문한적이 있거나 '.'인 경우 무시
				if(next_row<0 || next_col<0 || next_row>=N || next_col>=M ||
				   visited[next_row][next_col] || map[next_row][next_col]=='.') {
					continue;
				}
				
				//아니라면 큐에넣고 방문처리 후 음식물 크기 증가
				queue.offer(new Node(next_row, next_col));
				visited[next_row][next_col] = true;
				
				count++;
			}
		}
		
		//음식물 크기 리턴
		return count;
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	        
    	//통로 세로길이 N, 가로길이 M,음식물 개수 K 입력
    	st = new StringTokenizer(br.readLine());
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	int K = Integer.parseInt(st.nextToken());
    	
    	//방문처리배열
    	visited = new boolean[N][M];
    	
    	//맵 선언
    	map = new char[N][M];
    	
    	//맵의 값 모두 '.'으로 초기화
    	for(int i=0 ; i<N ; i++) {
    		Arrays.fill(map[i], '.');
    	}
    	
    	//음식물이 있는곳은 #으로 바꿔주기
    	while(K-->0) {
    		st = new StringTokenizer(br.readLine());
    		int row = Integer.parseInt(st.nextToken());
    		int col = Integer.parseInt(st.nextToken());
    		
    		map[row-1][col-1] = '#';
    	}
    	
    	//음식물 크기 최댓값 변수
    	int max = Integer.MIN_VALUE;
    	
    	for(int i=0 ; i<N ; i++) {
    		for(int j=0 ; j<M ; j++) {
    			//방문한적이 없고 #이라면 BFS시작
    			if(!visited[i][j] && map[i][j]=='#') {
    				
    				//최댓값 갱신
    				max = Math.max(max, BFS(i, j));
    			}
    		}
    	}
    	
    	//최댓값 출력
    	System.out.println(max);
    }
}	
