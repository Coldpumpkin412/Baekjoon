import java.util.*;
import java.io.*;

public class Main {
	static int a;
	static int b;
	
    //최대공약수 구하는 함수
	static int GCD(int num1, int num2) {
		a = Math.max(num1, num2);
		b = Math.min(num1, num2);
		int r = a % b;
		
		while(r != 0) {
			a = b;
			b = r;
			r = a % b;
		}
		
		return b;
		
	}
	public static void main(String[] args) throws IOException{
		/*
		 * 유클리드 호제법 활용
		 * 두 개의 수 중 큰 수를 작은수로 나눈 후 나머지를 구한다.
		 * 앞에서 나눈 수를 다시 나머지로 나눈다.
		 * 나머지가 0이 될 때까지 반복하며 0이된 당시의 나눈 수가 최대공약수가 된다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//테스트케이스 개수 입력
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			st = new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
            //최대공약수 활용하여 최소공배수 구하기
			System.out.println(GCD(A,B) * A/GCD(A,B) * B/GCD(A,B));
		}
	}
}

	
