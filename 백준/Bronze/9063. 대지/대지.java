import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		/*
		 * 입력된 좌표를 가지고 x좌표의 최댓값,최솟값 및 y좌표의 최댓값,최솟값을 확인
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//최솟값 및 최댓값 초기화(각 정수는 -10000~10000의 범위를 갖는다)
		int min_x = 10000;
		int min_y = 10000;
		int max_x = -10000;
		int max_y = -10000;
		
		//점의 개수 입력
		int N = Integer.parseInt(br.readLine());
		
		while(N-->0) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			//각 좌표의 최대값 및 최소값 초기화
			min_x = Math.min(min_x, x);
			max_x = Math.max(max_x, x);
			min_y = Math.min(min_y, y);
			max_y = Math.max(max_y, y);
		}
		
		System.out.print((max_x-min_x) * (max_y-min_y));
	}
}

	
