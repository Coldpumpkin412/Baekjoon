import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		/*
		 * 회의 종료시간을 기준으로 오름차순 정렬을 실시.
		 * 이후 처음 회의부터 비교해가며 계산하면 최댓값을 구할 수 있다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//회의의 수 N 입력 및 회의 시작/종료 시간 저장할 배열 선언
		int N = Integer.parseInt(br.readLine());
		int[][] meeting = new int[N][2]; //[N][0] : 시작시간, [N][1] : 종료시간
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine());
			
			//회의 시작시간 및 종료시간 입력
			meeting[i][0] = Integer.parseInt(st.nextToken());
			meeting[i][1] = Integer.parseInt(st.nextToken());
		}
		
		//회의 종료시간 기준으로 정렬(람다식 사용)
		Arrays.sort(meeting,(o1, o2) -> {
			//종료시간이 같다면 시작시간 빠른 순서로 정렬
			if(o1[1] == o2[1]) {
				return o1[0] - o2[0];
			}
			
			return o1[1]-o2[1];
		});
		
		//가능한 최대 회의의 수 초기화
		int count = 0;
		
		//종료시간 초기화
		int end = 0;
		
		for(int i=0 ; i<N ; i++) {
			
			//종료시간이 회의시작시간보다 작거나 같으면 갱신 후 회의 수 증가
			if(end <= meeting[i][0]) {
				count++;
				end = meeting[i][1];
			}
		}
		
		System.out.println(count);
	}
}

	
