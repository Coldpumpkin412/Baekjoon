import java.util.*;
import java.io.*;


public class Main {
	//흰색, 파란색 색종이의 개수 저장할 배열
	static int[] color = new int[2]; 
	
	//처음 주어지는 색종이를 저장할 배열
	static int[][] paper;
	
	//색종이의 길이 N, 좌상단 꼭지점의 좌표(a,b)
	static void divide(int N, int a, int b) {
		for(int i=a ; i<a+N ; i++) {
			for(int j=b ; j<b+N ; j++) {
				//재귀적으로 시행
				if(paper[i][j] != paper[a][b]) {
					divide(N/2, a, b);
					divide(N/2, a+N/2, b);
					divide(N/2, a, b+N/2);
					divide(N/2, a+N/2, b+N/2);
					
					return;
				}
			}
		}
		color[paper[a][b]]++;
	}
	public static void main(String[] args) throws IOException{
		/*
		 * 분할정복 활용.
		 * 시작점을 기준으로 칸들의 값이 일치하면 count++, 일치하지않으면 4분할
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//한 변의 길이 N 입력
		int N = Integer.parseInt(br.readLine());
		
		//색종이 크기 선언 및 값 입력
		paper = new int[N][N];
		for(int row=0 ; row<N ; row++) {
			st = new StringTokenizer(br.readLine());
			for(int col=0 ; col<N ; col++) {
				paper[row][col] = Integer.parseInt(st.nextToken());
			}
		}
		
		//한 변의 길이가 N이며 시작점은 (0,0)
		divide(N, 0, 0);
		
		System.out.println(color[0]);
		System.out.println(color[1]);
	}
}

	
