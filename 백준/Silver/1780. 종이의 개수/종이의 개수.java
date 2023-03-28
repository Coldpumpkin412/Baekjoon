import java.util.*;
import java.io.*;	

public class Main {
	static int N;
	static int[][] graph;
	
	//-1,0,1 영역의 개수
	static int minus_one = 0;
	static int zero = 0;
	static int one = 0;
	
	public static void partition(int row, int col, int size) {
		//같은 숫자로 이루어져있다면 값 증가
		if(numCheck(row, col, size)) {
			if(graph[row][col] == -1) minus_one++;
			else if(graph[row][col] == 0) zero++;
			else if(graph[row][col] == 1) one++;
			
			return;
		}
		
		//값이 다를경우 9개로 분할
		int next_Size = size/3;
		
		//분할된 그래프에 대해 partition메소드 재귀적 호출(기준 : 중앙블럭)
		partition(row, col, next_Size); //왼쪽위
		partition(row, col+next_Size, next_Size); //중앙위
		partition(row, col+next_Size+next_Size, next_Size); //오른쪽위
		partition(row+next_Size, col, next_Size); //왼쪽
		partition(row+next_Size, col+next_Size, next_Size); //중앙
		partition(row+next_Size, col+next_Size+next_Size, next_Size); //오른쪽
		partition(row+next_Size+next_Size, col, next_Size); //왼쪽아래
		partition(row+next_Size+next_Size, col+next_Size, next_Size); //중앙아래
		partition(row+next_Size+next_Size, col+next_Size+next_Size, next_Size); //오른쪽아래
		
	}
	
	//영역이 같은 숫자로 이루어져있는지 확인하는 메소드
	public static boolean numCheck(int row, int col, int size) {
		int number = graph[row][col];
		
		//시작점부터 사이즈까지 검사
		for(int i=row ; i<row+size ; i++) {
			for(int j=col ; j<col+size ; j++) {
				//다른 숫자가 발견될 시
				if(number != graph[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException{
		/*
		 * 분할정복 문제(재귀 활용)
		 * 1. 각 영역의 숫자가 같은지 검사(-1,0,1)
		 * 2. 같지 않다면 해당영역을 9개로 분할
		 * 3. 같다면 카운트 증가
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//첫째 줄에 종이의 크기 N(3^k 꼴) 입력
		N = Integer.parseInt(br.readLine());
		
		//NxN 꼴의 행렬 값 선언 및 값 입력
		graph = new int[N][N];
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0 ; j<N ; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		partition(0, 0, N);
		
		System.out.println(minus_one);
		System.out.println(zero);
		System.out.println(one);
	}
}

	
