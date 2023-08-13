import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// 입력받기
        st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(br.readLine());
		
        //주파수 차이 절댓값 활용
		int min = Math.abs(a - b);
		
		//즐겨찾기 입력받기
		for (int i=0 ; i<N ; i++) {
			//즐겨찾기 값 입력
			int num = Integer.parseInt(br.readLine());
			
			//(즐겨찾기와 듣고싶은 주파수의 차이)+즐겨찾기로 이동하는 수+1 vs 지금까지 최소 차이 
			min = Math.min(Math.abs(b-num)+1, min);
		}
		
		// 최소 차이 출력
		System.out.println(min);
	}
}