import java.util.*;
import java.io.*;	

public class Main {
	static int N,r,c;
	static int answer=0;
	
	public static void find(int row, int col, int size) {
		if(size == 1){
			System.out.println(answer);
			return;
		}
		
		int next_Size = size/2;
		//1사분면에 속한 경우
		if(r < row+next_Size && c < col+next_Size) {
			find(row, col, next_Size);
		}
		//2사분면에 속한 경우
		if(r < row+next_Size && c >= col+next_Size) {
			answer += (size*size) / 4;
			find(row, col+next_Size, next_Size);
		}//3사분면에 속한 경우
		if(r >= row+next_Size && c < col+next_Size) {
			answer += ((size*size)/4) * 2;
			find(row+next_Size, col, next_Size);
		}//4사분면에 속한 경우
		if(r >= row+next_Size && c >= col+next_Size) {
			answer += ((size*size)/4) * 3;
			find(row+next_Size, col+next_Size, next_Size);
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		/*
		 * 재귀를 활용하여 풀기.
		 * 배열을 4사분면으로 나눈 후 입력받은 r,c 가 어느 사분면에 속해있는지 확인
		 * 배열의크기(size)가 1인 경우의 배열값이 정답이 된다.
		 * 
		 * ex)size가 4일 경우 숫자는 0~15, 각 사분면의 시작값은 0,4,8,12가 된다.
		 * 작 재귀에서 이 시작값을 더해주면 된다.
		 * 2사분면의 경우 : size*size/4
		 * 3사분면의 경우 : (size*size/4) * 2
		 * 4사분면의 경우 : (size*size/4) * 3
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//배열의 크기 2^(N-1) 
		N = Integer.parseInt(st.nextToken());
		
		//찾고자하는 숫자의 위치(r행 c열)
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		//위치를 찾는 find 함수
		find(0,0,(int)Math.pow(2, N));
	}
}

	
