import java.util.*;
import java.io.*;	

public class Main{
	public static void main(String[] args) throws IOException{
		/*
		 * 삼각형 결성조건 = 가장 긴막대의 길이가 나머지 두 막대의 길이의 합보다 작다
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[] triangle = new int[3];
		
		st = new StringTokenizer(br.readLine());
		triangle[0] = Integer.parseInt(st.nextToken());
		triangle[1] = Integer.parseInt(st.nextToken());
		triangle[2] = Integer.parseInt(st.nextToken());
		
		//오름차순 정렬
		Arrays.sort(triangle);
		
		//가장 긴 변이 나머지 두 변의 합보다 작을때 문제없으므로 세 변의 합이 둘레
		if(triangle[0] + triangle[1] > triangle[2]) {
			System.out.println(triangle[0]+triangle[1]+triangle[2]);
		}else {//아닌 경우 가장 긴 변의 길이를 나머지 두변의 길이 합-1로 줄이면 된다
			
			//즉, 삼각형의 둘레는 가장 긴 변을 제외한 나머지 두변의 합 * 2 -1이다
			System.out.println(2*(triangle[0]+triangle[1]) - 1);
		}
	}
}

	
