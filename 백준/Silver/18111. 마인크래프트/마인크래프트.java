import java.util.*;
import java.io.*;

public class Main {
	//시간과 최대높이를 저장하는 결과 변수
	static int[] result = new int[2];
	
	//땅 배열 선언
	static int[][] land;
	
	//세로길이, 가로길이, 블록개수 선언
	static int N, M, B;
	
	//시간, 높이, 블록의 수 변수 선언
	static int time = Integer.MAX_VALUE; //최소시간을 구하기 위해 초기값은 가장 큰 수로 선언
	static int height;
	static int block;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//첫째 줄에 세로길이(N), 가로길이(M), 인벤토리 내 블록의 개수(B)입력
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		
		//둘째 줄부터 N행 M열의 크기로 땅의 높이 입력
		land = new int[N][M];
		
		int max = 0; //땅 높이의 최대값
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0 ; j<M ; j++) {
				land[i][j] = Integer.parseInt(st.nextToken());
				//높이의 최대값 최신화
				max = Math.max(max, land[i][j]);
			}
		}
		
		//최대 땅 높이에 따른 시간 계산함수
		answer(max);
		
		System.out.println(time + " " + height);
	}
	
	static void answer(int max) {
		//land 변수를 탐색하며 블럭의 갯수를 맞추고 그에 따른 시간 계산
		for(int i=0 ; i<=max ; i++) {
			result = explore(i);
			
			//시간은 최소값으로 계산
			if(time > result[0]) {
				time = result[0];
				height = result[1];
			}else if(time == result[0] && height<result[1]) {//시간이 같다면 땅의 높이가 높은것을 선택
				time = result[0];
				height = result[1];
			}
		}
	}
	
	//시간 및 높이를 리턴해주는 함수
	static int[] explore(int height) {
		int block = B;
		int time = 0;
		
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<M ; j++) {
				//기준이 되는 땅의 높이
				int number = land[i][j];
				
				//높이가 같다면 그대로 진행
				if(number == height) continue;
				
				//높이가 더 낮은경우
				if(number > height) {
					time += (number-height)*2; //한 블록당 2초 소요
					block += (number - height);
				}else {//높이가 더 높은경우
					time += height - number; //1초 소요
					block -= (height - number);
				}
			}
		}
		//남은 블럭의 개수가 0 미만이면 최대치 출력
		if(block < 0) {
			result[0] = 999999999;
			return result;
		}
		
		result[0] = time;
		result[1] = height;
		
		return result;
	}
}

	
