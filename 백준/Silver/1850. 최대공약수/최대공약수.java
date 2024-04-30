import java.util.*;
import java.io.*;

public class Main {
	//유클리드 호제법 활용한 GCD함수
	public static long GCD(long a, long b) {
		if(b == 0) {
			return a;
		}
		
		//재귀호출
		return GCD(b, a%b);
	}
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	
    	//A와 B를 이루는 1의 개수 입력
    	st = new StringTokenizer(br.readLine());
    	long A = Long.parseLong(st.nextToken());
    	long B = Long.parseLong(st.nextToken());
    	
    	//A와 B의 최대공약수 만큼 1을 써주면 된다
    	long number = GCD(A, B);
    	
    	for(int i=0 ; i<number ; i++) {
    		sb.append("1");
    	}
    	
    	System.out.println(sb.toString());
    }
}	
