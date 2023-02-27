import java.util.*;
import java.io.*;

public class Main {
	/*
	 * 각 수에따른 피보나치 함수 결과 각각 0,1의 개수는 다음과 같이 증가
	 * 0 : 1 0 1 1 2 3 5 8 13 21 ... (숫자 3부터 피보나치수열로 증가)
	 * 1 : 0 1 1 2 3 5 8 13 21 ...(숫자 2부터 피보나치 수열로 증가)
	 *  
	 */
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//동적프로그래밍을 활용하여 0과1의 개수를 배열로 표현
		int[] zero = new int[41];
		int[] one = new int[41];
		
		zero[0] = 1;
		zero[1] = 0;
		
		one[0] = 0;
		one[1] = 1;
		
		for(int i=2 ; i<=40 ; i++) {
			zero[i] = zero[i-1] + zero[i-2];
			one[i] = one[i-1] + one[i-2];
		}
		
		//테스트케이스 T 입력
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<T ; i++) {
			int num = Integer.parseInt(br.readLine());
			
			System.out.println(zero[num]+" "+one[num]);
		}
	}
}

	
