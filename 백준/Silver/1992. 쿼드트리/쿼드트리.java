import java.util.*;
import java.io.*;	


public class Main {
	static int N;
	static int[][] graph;
	
	static StringBuilder sb = new StringBuilder();
	
	public static void QuadTree(int row, int col, int size) {
		//같은 숫자로 이루어져있다면 쿼드압축
		if(numCheck(row, col, size)) {
			sb.append(graph[row][col]);
			return;
		}
		
		//압축이 불가능한 경우 사이즈 축소
		int next_Size = size/2;
		
		//재귀적 호출 전 괄호 열어주기
		sb.append("(");
		
		//분할된 그래프에 대해 QuadTree메소드 재귀적 호출(기준 : 중앙)
		QuadTree(row, col, next_Size); //왼쪽 위
		QuadTree(row, col+next_Size, next_Size); //오른쪽 위
		QuadTree(row+next_Size, col, next_Size); //왼쪽 아래
		QuadTree(row+next_Size, col+next_Size, next_Size); //오른쪽 아래
		
		
		//재귀적 호출 이후 괄호 닫기
		sb.append(")");
		
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
		 * 2. 같지 않다면 해당영역을 4개로 분할
		 * 3. 영역의 숫자가 모두 같다면 괄호와 함께 값 리턴
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//첫째 줄에 영상의 크기 N 입력(2의 제곱수 꼴)
		N = Integer.parseInt(br.readLine());
		
		//NxN꼴의 행렬 값 선언 및 값 입력
		graph = new int[N][N];
		for(int i=0 ; i<N ; i++) {
			String str = br.readLine();
			for(int j=0 ; j<N ; j++) {
				//정수형으로 변환을 위해 아스키코드활용
				graph[i][j] = str.charAt(j) - '0';
			}
		}
		
		QuadTree(0, 0, N);
		
		System.out.println(sb);
	}
}

	
